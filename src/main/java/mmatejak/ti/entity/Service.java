package mmatejak.ti.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "SERVICE")
public class Service extends AbstractEntity {

    @Column
    private String type;

    @Column
    private Long price;
}
