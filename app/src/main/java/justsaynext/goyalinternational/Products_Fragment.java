package justsaynext.goyalinternational;

import android.os.Bundle;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Products_Fragment extends Fragment {

    View myView;
    ImageView imgProducts;
    ExpandableListView expandableListView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.products,container,false);
        imgProducts=(ImageView)myView.findViewById(R.id.imgProducts);
        imgProducts.setImageResource(R.drawable.products);
/*
        expandableListView=(ExpandableListView)myView.findViewById(R.id.exp_products);
        List<String> product_headings=new ArrayList<String>();
        List<String> L1=new ArrayList<String>();
        List<String> L2=new ArrayList<String>();
        List<String> L3=new ArrayList<String>();
        List<String> L4=new ArrayList<String>();
        List<String> L5=new ArrayList<String>();
        List<String> L6=new ArrayList<String>();
        List<String> L7=new ArrayList<String>();
        List<String> L8=new ArrayList<String>();
        HashMap<String,List<String>> childList=new HashMap<String,List<String>>();

        String heading_items[]=getResources().getStringArray(R.array.product_titles);
        String l1[]=getResources().getStringArray(R.array.carriage_products1);
        String l2[]=getResources().getStringArray(R.array.hexbolts_products2);
        String l3[]=getResources().getStringArray(R.array.hexNuts_products3);
        String l4[]=getResources().getStringArray(R.array.beltBolts_products4);
        String l5[]=getResources().getStringArray(R.array.LS_products5);
        String l6[]=getResources().getStringArray(R.array.Hot_Forged_products6);
        String l7[]=getResources().getStringArray(R.array.Weftgrate_products7);
        String l8[]=getResources().getStringArray(R.array.Wirespring_products8);


        for(String title:heading_items)
        {
            product_headings.add(title);
        }

        for(String title:l1)
        {
            L1.add(title);
        }

        for(String title:l2)
        {
            L2.add(title);
        }
        for(String title:l3)
        {
            L3.add(title);
        }
        for(String title:l4)
        {
            L4.add(title);
        }
        for(String title:l5)
        {
            L5.add(title);
        }
        for(String title:l6)
        {
            L6.add(title);
        }
        for(String title:l7)
        {
            L7.add(title);
        }
        for(String title:l8)
        {
            L8.add(title);
        }

        childList.put(product_headings.get(0),L1);
        childList.put(product_headings.get(1),L2);
        childList.put(product_headings.get(2),L3);
        childList.put(product_headings.get(3),L4);
        childList.put(product_headings.get(4),L5);
        childList.put(product_headings.get(5),L6);
        childList.put(product_headings.get(6),L7);
        childList.put(product_headings.get(7),L8);
        ProductsAdapter productsAdapter=new ProductsAdapter(getActivity().getApplicationContext(),product_headings,childList);
        expandableListView.setAdapter(productsAdapter);


*/

        return myView;
    }
}
