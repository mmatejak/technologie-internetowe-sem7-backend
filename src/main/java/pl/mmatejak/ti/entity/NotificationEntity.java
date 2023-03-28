package pl.mmatejak.ti.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * TODO: Write javadoc
 */
@Getter
@Setter
@Entity
@Table(name = "NOTIFICATION")
public class NotificationEntity extends AbstractEntity {

    /**
     * TODO: Write javadoc
     */
    @Column
    private LocalDateTime deliveryTime;

    /**
     * TODO: Write javadoc
     */
    @Column
    private String description;

    /**
     * TODO: Write javadoc
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIENT_ID")
    private ClientEntity clientEntity;

    /**
     * TODO: Write javadoc
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SERVICE_ID")
    private ServiceEntity serviceEntity;
}
