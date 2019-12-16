package mmatejak.ti.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    private LocalDateTime creationDateTime;

    @LastModifiedDate
    private LocalDateTime updateDateTime;

    @Column
    private String postCode;

    @Column
    private String town;

    @Column
    private String street;

    @Column
    private String streetNumber;
}
