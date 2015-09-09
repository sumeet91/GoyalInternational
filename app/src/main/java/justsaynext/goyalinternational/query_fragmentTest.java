package justsaynext.goyalinternational;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.Properties;

import javax.mail.*;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.*;


public class query_fragmentTest extends Fragment {

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
                String to="sumeetmaan91@gmail.com";
                String subject="Query from GI app";
                String msg=txtQueryName.getText().toString()+"  "+txtQueryPhNo.getText().toString()+"  "+
                        txtQueryInfo.getText().toString();

                Properties props = new Properties();
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.socketFactory.port", "465");
                props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.port", "465");

                Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("sumeetmaan91@gmail.com", "Nature12#");
                    }
                });

                try {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(to));
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
                    message.setSubject(subject);
                    message.setContent(msg, "text/html; charset=utf-8");

                    Transport.send(message);

                } catch (MessagingException e) {
                    throw new RuntimeException(e);
                }
            }


        });


        return myView;
    }
}
