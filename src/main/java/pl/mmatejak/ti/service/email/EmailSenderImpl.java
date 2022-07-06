package pl.mmatejak.ti.service.email;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import pl.mmatejak.ti.dto.NotificationDto;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * Service implementation for sending emails
 * Created by
 *
 * @author Mariusz Matejak on 05.06.19
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class EmailSenderImpl implements EmailSender {

    private final JavaMailSender javaMailSender;

    @Override
    public void sendConfirmEmail(NotificationDto notificationDto) {
        MimeMessage mail = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mail, true);
            helper.setTo(notificationDto.clientDto().email());
            helper.setFrom("assistance@google.com");
            helper.setSubject(notificationDto.service());
            helper.setText(notificationDto.toString());
        } catch (MessagingException e) {
            throw new UnsupportedOperationException();
        }
        javaMailSender.send(mail);
    }
}

