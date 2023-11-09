package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailApi {
    @Autowired
    Messages objectOfMess;
    //here  dependency injection will happen and the object of mailsender which is created by @component will get this ref
    @Autowired
    Mailsender obj;

    @GetMapping("IamMailSender")
    public Messages messageApi(){
        obj.mailsend();
        return objectOfMess;

    }
}
