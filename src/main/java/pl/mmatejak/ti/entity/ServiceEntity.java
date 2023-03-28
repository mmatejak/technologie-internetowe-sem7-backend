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
@Table(name = "SERVICE")
public class ServiceEntity extends AbstractEntity {

    /**
     * TODO: Write javadoc
     */
    @Column
    private String type;

    /**
     * TODO: Write javadoc
     */
    @Column
    private Long price;
}
