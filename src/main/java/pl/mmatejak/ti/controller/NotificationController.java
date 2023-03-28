package pl.mmatejak.ti.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mmatejak.ti.dto.NotificationDto;
import pl.mmatejak.ti.entity.NotificationEntity;
import pl.mmatejak.ti.repository.NotificationRepository;
import pl.mmatejak.ti.service.NotificationManagement;
import pl.mmatejak.ti.service.email.EmailSender;

import java.util.List;

/**
 * TODO: Write javadoc
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/notifications")
public class NotificationController {

    /**
     * TODO: Write javadoc
     */
    private final NotificationManagement notificationManagement;

    /**
     * TODO: Write javadoc
     */
    private final NotificationRepository notificationRepository;

    /**
     * TODO: Write javadoc
     */
    private final EmailSender emailSender;

    /**
     * TODO: Write javadoc
     */
    @GetMapping("/all")
    public List<NotificationEntity> getAllNotifications() {
        return notificationRepository.findAll();
    }

    /**
     * TODO: Write javadoc
     */
    @PostMapping("/add")
    public void addNotification(final @RequestBody NotificationDto notificationDto) {
        notificationManagement.addNewNotification(notificationDto);
        emailSender.sendConfirmEmail(notificationDto);
    }
}
