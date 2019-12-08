package mmatejak.ti.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table
public class Address {

    @Id
    @Column
    private long addressId;

    @Column
    private String postCode;

    @Column
    private String town;

    @Column
    private String street;

    @Column
    private String streetNumber;
}
