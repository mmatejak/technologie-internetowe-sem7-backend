package pl.mmatejak.ti.service;

import lombok.AllArgsConstructor;
import pl.mmatejak.ti.dto.NotificationDto;
import pl.mmatejak.ti.entity.Address;
import pl.mmatejak.ti.entity.Client;
import pl.mmatejak.ti.entity.Notification;
import pl.mmatejak.ti.repository.ServiceRepository;
import pl.mmatejak.ti.repository.ClientRepository;
import pl.mmatejak.ti.repository.NotificationRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificationManagement {

    private final ClientRepository clientRepository;
    private final NotificationRepository notificationRepository;
    private final ServiceRepository serviceRepository;

    public void addNewNotification(NotificationDto notificationDto) {
        notificationRepository.save(prepareNewNotification(notificationDto));
    }

    private Notification prepareNewNotification(NotificationDto notificationDto) {
        Notification notification = new Notification();
        Client findedClient = clientRepository.findByEmail(notificationDto.clientDto().email());
        if (findedClient == null) {
            prepareNewClient(notificationDto);
        } else {
            notification.setClient(findedClient);
        }
        notification.setService(serviceRepository.findByType(notificationDto.service()));
        notification.setDescription(notificationDto.description());
        return notification;
    }

    private void prepareNewClient(NotificationDto notificationDto) {
        Client client = new Client();
        client.setName(notificationDto.clientDto().name());
        client.setSurname(notificationDto.clientDto().surname());
        client.setEmail(notificationDto.clientDto().email());
        client.setPhoneNumber(notificationDto.clientDto().phoneNumber());
        client.setAddress(prepareNewAddress(notificationDto));
    }

    private Address prepareNewAddress(NotificationDto notificationDto) {
        Address address = new Address();
        address.setPostCode(notificationDto.addressDto().postCode());
        address.setTown(notificationDto.addressDto().town());
        address.setStreet(notificationDto.addressDto().street());
        address.setStreetNumber(notificationDto.addressDto().streetNumber());
        return address;
    }
}
