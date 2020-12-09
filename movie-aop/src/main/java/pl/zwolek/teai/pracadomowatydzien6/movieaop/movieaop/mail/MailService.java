package pl.zwolek.teai.pracadomowatydzien6.movieaop.movieaop.mail;

import javax.mail.MessagingException;

public interface MailService {
    void sendMail(String to,
                  String subject,
                  String text,
                  boolean isHtmlContent) throws MessagingException;
}
