package pl.mmatejak.ti.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.mmatejak.ti.dto.NotificationDto;
import pl.mmatejak.ti.entity.NotificationEntity;
import pl.mmatejak.ti.repository.NotificationRepository;
import pl.mmatejak.ti.service.NotificationManagement;
import pl.mmatejak.ti.service.email.EmailSender;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/notifications")
public class NotificationController {

    private final NotificationManagement notificationManagement;
    private final NotificationRepository notificationRepository;
    private final EmailSender emailSender;

    @GetMapping("/all")
    public List<NotificationEntity> getAllNotifications() {
        return notificationRepository.findAll();
    }

    @PostMapping("/add")
    public void addNotification(@RequestBody NotificationDto notificationDto) {
        notificationManagement.addNewNotification(notificationDto);
        emailSender.sendConfirmEmail(notificationDto);
    }
}
