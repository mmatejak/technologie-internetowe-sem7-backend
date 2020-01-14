package pl.mmatejak.ti.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.mmatejak.ti.dto.NotificationDto;
import pl.mmatejak.ti.entity.Notification;
import pl.mmatejak.ti.repository.NotificationRepository;
import pl.mmatejak.ti.service.NotificationManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mmatejak.ti.service.email.EmailSender;

import java.util.List;

@RestController
@Getter
@AllArgsConstructor
@RequestMapping("/api/notifications")
public class NotificationController {

    private final NotificationManagement notificationManagement;
    private final NotificationRepository notificationRepository;
    private final EmailSender emailSender;

    @GetMapping("/all")
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    @PostMapping("/add")
    public void addNotification(@RequestBody NotificationDto notificationDto) {
        notificationManagement.addNewNotification(notificationDto);
        emailSender.sendConfirmEmail(notificationDto);
    }
}
