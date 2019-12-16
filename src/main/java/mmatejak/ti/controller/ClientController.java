package mmatejak.ti.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import mmatejak.ti.entity.Client;
import mmatejak.ti.repository.ClientRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Getter
@AllArgsConstructor
@RequestMapping("/clients")
public class ClientController {

    private final ClientRepository clientRepository;

    @GetMapping("/all")
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @PostMapping("/add")
    public void addClient(@RequestBody Client client) {
        clientRepository.save(client);
    }
}
