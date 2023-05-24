package pl.mmatejak.ti.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "SERVICE")
public class ServiceEntity {

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
