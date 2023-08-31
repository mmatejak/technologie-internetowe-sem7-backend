package pl.mmatejak.ti.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "ADDRESS")
public class AddressEntity {

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
