package mmatejak.ti.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table
public class Client {

    @Id
    @Column
    private long clientId;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String phoneNumber;

    @Column
    @Email
    private String email;

    @OneToOne
    private Address address;
}
