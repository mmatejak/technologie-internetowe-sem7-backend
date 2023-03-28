package pl.mmatejak.ti.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.mmatejak.ti.entity.ServiceEntity;
import pl.mmatejak.ti.repository.ServiceRepository;

import java.util.List;

/**
 * TODO: Write javadoc
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/services")
public class ServiceController {

    /**
     * TODO: Write javadoc
     */
    private final ServiceRepository serviceRepository;

    /**
     * TODO: Write javadoc
     */
    @GetMapping("/all")
    public List<ServiceEntity> getAllServices() {
        return serviceRepository.findAll();
    }

    /**
     * TODO: Write javadoc
     */
    @GetMapping("/by-type")
    public ServiceEntity findByType(final @RequestParam String type) {
        return serviceRepository.findByType(type);
    }
}
