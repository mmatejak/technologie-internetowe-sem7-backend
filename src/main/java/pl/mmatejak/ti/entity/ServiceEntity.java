package pl.mmatejak.ti.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "SERVICE")
public class ServiceEntity extends AbstractEntity {

    @Column
    private String type;

    @Column
    private Long price;
}
