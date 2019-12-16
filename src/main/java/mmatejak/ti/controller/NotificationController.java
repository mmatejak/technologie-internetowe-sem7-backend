package mmatejak.ti.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import mmatejak.ti.entity.Notification;
import mmatejak.ti.repository.NotificationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Getter
@AllArgsConstructor
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationRepository notificationRepository;

    @GetMapping("/all")
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    @PostMapping("/add")
    public void addNotification(@RequestBody Notification notification) {
        notificationRepository.save(notification);
    }
}
