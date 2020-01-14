package pl.mmatejak.ti.dto;

import lombok.Value;

@Value
public class ClientDto {

    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
}
