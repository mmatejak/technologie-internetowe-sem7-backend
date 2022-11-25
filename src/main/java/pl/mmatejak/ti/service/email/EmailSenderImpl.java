package pl.mmatejak.ti.service.email;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import pl.mmatejak.ti.dto.NotificationDto;

/**
 * Service implementation for sending emails
 * Created by
 *
 * @author Mariusz Matejak on 05.06.19
 */
@Service
@RequiredArgsConstructor
public class EmailSenderImpl implements EmailSender {

    private final JavaMailSender javaMailSender;

    @Override
    public void sendConfirmEmail(NotificationDto notificationDto) {
        MimeMessage mail = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mail, true);
            helper.setTo(notificationDto.client().email());
            helper.setFrom("assistance@google.com");
            helper.setSubject(notificationDto.service());
            helper.setText(notificationDto.toString());
        } catch (MessagingException e) {
            throw new UnsupportedOperationException();
        }
        javaMailSender.send(mail);
    }
}

