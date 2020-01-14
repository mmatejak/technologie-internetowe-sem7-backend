package pl.mmatejak.ti.repository;

import pl.mmatejak.ti.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {

    Service findByType(String type);
}
