package zkt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import zkt.mail.SimpleMail;
import zkt.service.MailSenderService;


@Controller
public class MailController {
    @Autowired
    MailSenderService senderService;

    @ResponseBody
    @RequestMapping(value = "/mail", method = RequestMethod.GET)
    public String sendMail(){
        System.out.println("发送邮件");
        senderService.sendSimpleMail(new SimpleMail("1249505842@qq.com"));
        return "success";
    }
}
