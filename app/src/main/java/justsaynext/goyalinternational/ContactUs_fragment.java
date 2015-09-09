package justsaynext.goyalinternational;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;




public class ContactUs_fragment extends Fragment {

    View myView;
    TextView txtConAddress,txtConPhNo,txtConEmail;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.contactus,container,false);

        txtConAddress=(TextView)myView.findViewById(R.id.txtConAddress);
        txtConAddress.setText(Html.fromHtml("  D-149,Phase IV-A ,Focal Point,LUDHIANA-141010(Pb.),INDIA    <br>"));

        txtConPhNo=(TextView)myView.findViewById(R.id.txtConPhNo);
        txtConPhNo.setText(Html.fromHtml(" 9417230616, 9988270077<br>" +
                "  0160-5007200"));
        txtConEmail=(TextView)myView.findViewById(R.id.txtConEmail);
        txtConEmail.setText(Html.fromHtml(" goyalyash77@gmail.com <br>"));

        return myView;
    }


}
