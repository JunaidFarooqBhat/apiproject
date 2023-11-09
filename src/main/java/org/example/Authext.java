package org.example;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Authext extends Authenticator {
    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("tigerjuney31@gmail.com","aaenmxikrsuxduox");
    }
}
