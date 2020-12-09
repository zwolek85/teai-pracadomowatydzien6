package pl.zwolek.teai.pracadomowatydzien6.movieaop.movieaop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.zwolek.teai.pracadomowatydzien6.movieaop.movieaop.mail.MailService;

import javax.mail.MessagingException;

@Component
@Aspect
public class SendMailAspect {

    private final MailService mailService;

    @Autowired
    public SendMailAspect(MailService mailService) {
        this.mailService = mailService;
    }

    @After("@annotation(SendMail)")
    private void afterAddCarr() throws MessagingException {
        mailService.sendMail("toMail",
                "Dodano nowy samochod",
                "<b>Dodano nowy samochod</b><br>:P", true);
    }

}
