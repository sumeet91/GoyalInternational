package justsaynext.goyalinternational;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class query_fragment extends Fragment {

    EditText txtQueryName;
    EditText txtQueryPhNo;
    EditText txtQueryInfo;
    Button btnSubmit;
    View myView;
    Context con;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        myView=inflater.inflate(R.layout.query_layout,container,false);
        txtQueryName=(EditText)myView.findViewById(R.id.txtQueryName);
        txtQueryPhNo=(EditText)myView.findViewById(R.id.txtQueryPhNo);
        txtQueryInfo=(EditText)myView.findViewById(R.id.txtQueryInfo);
        btnSubmit=(Button)myView.findViewById(R.id.btnSubmit);

        //send email on button click

        btnSubmit.setOnClickListener(new View.OnClickListener()
        {
            @Override
        public void onClick(View v)
            {
                String to="goyal.rohan1992@gmail.com";
                String subject="Query from GI app";
                String message=txtQueryName.getText().toString()+"  "+txtQueryPhNo.getText().toString()+"  "+
                        txtQueryInfo.getText().toString();

                Intent i=new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                i.putExtra(Intent.EXTRA_SUBJECT, subject);
                i.putExtra(Intent.EXTRA_TEXT, message);
                i.setType("message/rfc822");
                startActivity(Intent.createChooser(i, "EMAIL"));

}
        });


        return myView;
    }
}
