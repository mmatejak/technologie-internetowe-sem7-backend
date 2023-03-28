package pl.mmatejak.ti.dto;

public record AddressDto(
        String postCode,
        String town,
        String street,
        String streetNumber
) {
}
