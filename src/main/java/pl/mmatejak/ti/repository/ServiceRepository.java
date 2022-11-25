package pl.mmatejak.ti.repository;

import pl.mmatejak.ti.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {

    ServiceEntity findByType(String type);
}
