package mmatejak.ti.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table
public class Notification {

    @Id
    @Column
    private long notificationId;

    @Column
    private LocalDateTime notificationDateTime;

    @Column
    private LocalDateTime deliveryTime;

    @Column
    private String description;

    @ManyToOne
    private Client clientId;

    @ManyToOne
    private Service serviceId;
}
