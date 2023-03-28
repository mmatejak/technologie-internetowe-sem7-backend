package pl.mmatejak.ti.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * TODO: Write javadoc
 */
@Getter
@Setter
@Entity
@Table(name = "ADDRESS")
public class AddressEntity extends AbstractEntity {

    /**
     * TODO: Write javadoc
     */
    @Column
    private String postCode;

    /**
     * TODO: Write javadoc
     */
    @Column
    private String town;

    /**
     * TODO: Write javadoc
     */
    @Column
    private String street;

    /**
     * TODO: Write javadoc
     */
    @Column
    private String streetNumber;
}
