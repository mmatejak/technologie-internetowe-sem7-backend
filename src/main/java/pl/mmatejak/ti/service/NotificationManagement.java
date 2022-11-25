package pl.mmatejak.ti.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mmatejak.ti.dto.NotificationDto;
import pl.mmatejak.ti.entity.AddressEntity;
import pl.mmatejak.ti.entity.ClientEntity;
import pl.mmatejak.ti.entity.NotificationEntity;
import pl.mmatejak.ti.repository.ClientRepository;
import pl.mmatejak.ti.repository.NotificationRepository;
import pl.mmatejak.ti.repository.ServiceRepository;

@Service
@RequiredArgsConstructor
public class NotificationManagement {

    private final ClientRepository clientRepository;
    private final NotificationRepository notificationRepository;
    private final ServiceRepository serviceRepository;

    public void addNewNotification(NotificationDto notificationDto) {
        notificationRepository.save(prepareNewNotification(notificationDto));
    }

    private NotificationEntity prepareNewNotification(NotificationDto notificationDto) {
        NotificationEntity notificationEntity = new NotificationEntity();
        ClientEntity foundedClientEntity = clientRepository.findByEmail(notificationDto.client().email());
        if (foundedClientEntity == null) {
            prepareNewClient(notificationDto);
        } else {
            notificationEntity.setClientEntity(foundedClientEntity);
        }
        notificationEntity.setServiceEntity(serviceRepository.findByType(notificationDto.service()));
        notificationEntity.setDescription(notificationDto.description());
        return notificationEntity;
    }

    private void prepareNewClient(NotificationDto notificationDto) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setName(notificationDto.client().name());
        clientEntity.setSurname(notificationDto.client().surname());
        clientEntity.setEmail(notificationDto.client().email());
        clientEntity.setPhoneNumber(notificationDto.client().phoneNumber());
        clientEntity.setAddressEntity(prepareNewAddress(notificationDto));
    }

    private AddressEntity prepareNewAddress(NotificationDto notificationDto) {
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setPostCode(notificationDto.address().postCode());
        addressEntity.setTown(notificationDto.address().town());
        addressEntity.setStreet(notificationDto.address().street());
        addressEntity.setStreetNumber(notificationDto.address().streetNumber());
        return addressEntity;
    }
}
