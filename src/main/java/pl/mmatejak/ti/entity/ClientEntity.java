package pl.mmatejak.ti.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CLIENT")
public class ClientEntity extends AbstractEntity {

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String phoneNumber;

    @Column
    @Email
    private String email;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ADDRESS_ID")
    private AddressEntity addressEntity;
}
