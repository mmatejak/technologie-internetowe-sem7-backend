package mmatejak.ti.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "SERVICE")
public class Service {

    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    private LocalDateTime creationDateTime;

    @LastModifiedDate
    private LocalDateTime updateDateTime;

    @Column
    private String type;

    @Column
    private Long price;
}
