package mmatejak.ti.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import mmatejak.ti.entity.Service;
import mmatejak.ti.repository.ServiceRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Getter
@AllArgsConstructor
@RequestMapping("/services")
public class ServiceController {

    private final ServiceRepository serviceRepository;

    @GetMapping("/all")
    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }
}
