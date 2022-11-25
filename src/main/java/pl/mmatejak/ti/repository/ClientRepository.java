package pl.mmatejak.ti.repository;

import pl.mmatejak.ti.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

    ClientEntity findByEmail(String email);
}
