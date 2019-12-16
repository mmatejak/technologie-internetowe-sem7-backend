package mmatejak.ti.dto;

import lombok.Value;

@Value
public class AddressDto {

    private String postCode;
    private String town;
    private String street;
    private String streetNumber;
}
