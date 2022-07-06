package pl.mmatejak.ti.dto;

public record NotificationDto(String description, String service, ClientDto clientDto, AddressDto addressDto) {
}
