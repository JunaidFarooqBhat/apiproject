package org.example;

import org.springframework.stereotype.Component;

@Component
public class Messages {
    private String mess=" this is the message which is created by junaid using springboot framework";

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }
}
