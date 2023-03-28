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

/**
 * TODO: Write javadoc
 */
@Getter
@Setter
@Entity
@Table(name = "CLIENT")
public class ClientEntity extends AbstractEntity {

    /**
     * TODO: Write javadoc
     */
    @Column
    private String name;

    /**
     * TODO: Write javadoc
     */
    @Column
    private String surname;

    /**
     * TODO: Write javadoc
     */
    @Column
    private String phoneNumber;

    /**
     * TODO: Write javadoc
     */
    @Column
    @Email
    private String email;

    /**
     * TODO: Write javadoc
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ADDRESS_ID")
    private AddressEntity addressEntity;
}
