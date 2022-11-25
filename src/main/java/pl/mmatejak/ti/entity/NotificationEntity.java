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

@Getter
@Setter
@Entity
@Table(name = "NOTIFICATION")
public class NotificationEntity extends AbstractEntity {

    @Column
    private LocalDateTime deliveryTime;

    @Column
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIENT_ID")
    private ClientEntity clientEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SERVICE_ID")
    private ServiceEntity serviceEntity;
}
