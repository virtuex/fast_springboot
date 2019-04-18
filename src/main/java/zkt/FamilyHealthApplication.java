package zkt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.stereotype.Component;
import zkt.mail.HtmlMail;
import zkt.mail.SimpleMail;
import zkt.service.MailSenderService;

@SpringBootApplication
@Configuration
@EnableSpringDataWebSupport
@Component
public class FamilyHealthApplication {
    @Autowired
    private MailSenderService senderService;

    public static void main(String[] args) {
        SpringApplication.run(FamilyHealthApplication.class, args);
    }


}
