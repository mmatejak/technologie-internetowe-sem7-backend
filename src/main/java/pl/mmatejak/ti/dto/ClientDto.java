package pl.mmatejak.ti.dto;

public record ClientDto(
        String name,
        String surname,
        String phoneNumber,
        String email
) {
}
