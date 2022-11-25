package pl.mmatejak.ti.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.mmatejak.ti.entity.ServiceEntity;
import pl.mmatejak.ti.repository.ServiceRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/services")
public class ServiceController {

    private final ServiceRepository serviceRepository;

    @GetMapping("/all")
    public List<ServiceEntity> getAllServices() {
        return serviceRepository.findAll();
    }

    @GetMapping("/by-type")
    public ServiceEntity findByType(@RequestParam String type) {
        return serviceRepository.findByType(type);
    }
}
