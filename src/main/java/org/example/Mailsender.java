package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
@Component
public class Mailsender {
   //here I am making the refrence of mess object and  dependency injection happens here for the obj of Messages class,
   // there in Messages class i am using @component annotation the obj created by this will get that below reference
    @Autowired
   Messages object;

    public  void mailsend(){
        //setting the properties
       Properties properties= System.getProperties();
       properties.put("mail.smtp.host","smtp.gmail.com");
       properties.put("mail.smtp.port","465");
       properties.put("mail.smtp.ssl.enable","true");
       properties.put("mail.smtp.auth","true");

       // makeing auth
        Authenticator auth = new Authext();
        //creation session
        Session session = Session.getInstance(properties,auth);
        //making memimessage
        MimeMessage mailmessage = new MimeMessage(session);
        String ItcontainsMess=object.getMess();
        try{
            mailmessage.setFrom("tigerjuney31@gmail.com");
            mailmessage.setRecipient(Message.RecipientType.TO,new InternetAddress("junaidfarooq161@gmail.com"));
            mailmessage.setSubject("This is Api Calling Data From junaid");

            mailmessage.setText(ItcontainsMess);
            Transport.send(mailmessage);
            System.out.println("Sended Successfully.....");

        }catch (Exception ex){
            System.out.println("Error in creationg message body...please look into code");
            System.out.println(ex);
        }


    }
}
