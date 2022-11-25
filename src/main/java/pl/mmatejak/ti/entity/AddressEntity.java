package pl.mmatejak.ti.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ADDRESS")
public class AddressEntity extends AbstractEntity {

    @Column
    private String postCode;

    @Column
    private String town;

    @Column
    private String street;

    @Column
    private String streetNumber;
}
