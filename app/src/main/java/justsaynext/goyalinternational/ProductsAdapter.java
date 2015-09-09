package justsaynext.goyalinternational;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by lenovo on 07-09-2015.
 */
public class ProductsAdapter extends BaseExpandableListAdapter {
    private List<String> product_titles;
    private HashMap<String,List<String>> child_titles;
    private Context ctx;

    public ProductsAdapter(Context ctx,List<String> product_titles, HashMap<String, List<String>> child_titles ) {
        this.product_titles = product_titles;
        this.child_titles = child_titles;
        this.ctx = ctx;
    }

    @Override
    public int getGroupCount() {
        return product_titles.size();
    }

    @Override
    public int getChildrenCount(int groupPosition)
    {
        return child_titles.get(product_titles.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return product_titles.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return child_titles.get(product_titles.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String title=(String)this.getGroup(groupPosition);
        if(convertView == null) {
            LayoutInflater layoutInflater=(LayoutInflater)this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.exp_parent_product,null);

        }
        TextView textView=(TextView)convertView.findViewById(R.id.txt_parent);
        textView.setTypeface(null, Typeface.BOLD);
        textView.setText(title);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String title=(String)this.getChild(groupPosition,childPosition);
        if(convertView == null) {
            LayoutInflater layoutInflater=(LayoutInflater)this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.exp_child_product,null);

        }
        TextView textView=(TextView)convertView.findViewById(R.id.txt_child);
        textView.setText(title);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
