package pl.mmatejak.ti.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.mmatejak.ti.entity.Service;
import pl.mmatejak.ti.repository.ServiceRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Getter
@AllArgsConstructor
@RequestMapping("/api/services")
public class ServiceController {

    private final ServiceRepository serviceRepository;

    @GetMapping("/all")
    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }

    @GetMapping("/by-type")
    public Service findByType(@RequestParam String type) {
        return serviceRepository.findByType(type);
    }
}
