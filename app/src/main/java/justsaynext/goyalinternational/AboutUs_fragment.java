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

public class AboutUs_fragment extends Fragment{

    View myView;
    ImageView imgAboutUs;
    TextView txtAboutUs;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.aboutus,container,false);
        imgAboutUs=(ImageView)myView.findViewById(R.id.imgAboutUs);
        imgAboutUs.setImageResource(R.drawable.aboutus);

        txtAboutUs=(TextView)myView.findViewById(R.id.txtAboutUs);
        txtAboutUs.setText(Html.fromHtml(""));
        return myView;
    }
}

