package mmatejak.ti.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "ADDRESS")
public class Address extends AbstractEntity {

    @Column
    private String postCode;

    @Column
    private String town;

    @Column
    private String street;

    @Column
    private String streetNumber;
}
