package justsaynext.goyalinternational;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class home_fragment extends Fragment {

    View myView;
    ImageView imgHome;
    TextView txtHome;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.home_layout,container,false);
        imgHome = (ImageView)myView.findViewById(R.id.imgHome);
        imgHome.setImageResource(R.drawable.home);

        txtHome=(TextView)myView.findViewById(R.id.txtHome);
        txtHome.setText(Html.fromHtml("At GOYAL INTERNATIONAL our love towards our work makes us a distinguished crew amongst the rest.<br>" +
                "We are manufacturers and exporters of Loom parts and hot forged bolts . We also manufacture carriage bolts, Hex bolts, L Key bolts, Belt bolts and other specialized bolts. Our products break records and set new trends every day. <br>" +
                "Our quality is marketed under Brands:<br>" +
                "GI®<br>" +
                "PEACOCK®<br>" +
                "DEER®<br>"));
        return myView;
    }
}
