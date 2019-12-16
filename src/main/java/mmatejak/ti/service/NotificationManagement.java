package mmatejak.ti.service;

import lombok.AllArgsConstructor;
import mmatejak.ti.dto.NotificationDto;
import mmatejak.ti.entity.Address;
import mmatejak.ti.entity.Client;
import mmatejak.ti.entity.Notification;
import mmatejak.ti.repository.ClientRepository;
import mmatejak.ti.repository.NotificationRepository;
import mmatejak.ti.repository.ServiceRepository;
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
        Client findedClient = clientRepository.findByEmail(notificationDto.getClientDto().getEmail());
        if (findedClient == null) {
            prepareNewClient(notificationDto);
        } else {
            notification.setClient(findedClient);
        }
        notification.setService(serviceRepository.findByType(notificationDto.getService()));
        return notification;
    }

    private void prepareNewClient(NotificationDto notificationDto) {
        Client client = new Client();
        client.setName(notificationDto.getClientDto().getName());
        client.setSurname(notificationDto.getClientDto().getSurname());
        client.setEmail(notificationDto.getClientDto().getEmail());
        client.setPhoneNumber(notificationDto.getClientDto().getPhoneNumber());
        client.setAddress(prepareNewAddress(notificationDto));
    }

    private Address prepareNewAddress(NotificationDto notificationDto) {
        Address address = new Address();
        address.setPostCode(notificationDto.getAddressDto().getPostCode());
        address.setTown(notificationDto.getAddressDto().getTown());
        address.setStreet(notificationDto.getAddressDto().getStreet());
        address.setStreetNumber(notificationDto.getAddressDto().getStreetNumber());
        return address;
    }
}