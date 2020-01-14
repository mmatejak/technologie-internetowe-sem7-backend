package pl.mmatejak.ti.service.email;

import pl.mmatejak.ti.dto.NotificationDto;

/**
 * Created by
 *
 * @author Mariusz Matejak on 05.06.19
 */
public interface EmailSender {

    void sendConfirmEmail(NotificationDto notificationDto);
}
