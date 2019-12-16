package mmatejak.ti.dto;

import lombok.Value;

@Value
public class NotificationDto {

    private String description;
    private String service;
    private ClientDto clientDto;
    private AddressDto addressDto;
}
