package mmatejak.ti.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import mmatejak.ti.entity.Address;
import mmatejak.ti.repository.AddressRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Getter
@AllArgsConstructor
@RequestMapping("/addresses")
public class AddressController {

    private final AddressRepository addressRepository;

    @GetMapping("/all")
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }
}
