package pl.mmatejak.ti.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/**
 * TODO: Write javadoc
 */
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "NOTIFICATION")
public class NotificationEntity {

    /**
     * TODO: Write javadoc
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * TODO: Write javadoc
     */
    @CreatedDate
    private LocalDateTime createdDateTime;

    /**
     * TODO: Write javadoc
     */
    @LastModifiedDate
    private LocalDateTime lastModifiedDateTime;

    @Version
    private Long version;

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
