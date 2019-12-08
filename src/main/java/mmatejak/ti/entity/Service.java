package mmatejak.ti.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table
public class Service {

    @Id
    @Column
    private long serviceId;

    @Column
    private String type;

    @Column
    private Long price;
}
