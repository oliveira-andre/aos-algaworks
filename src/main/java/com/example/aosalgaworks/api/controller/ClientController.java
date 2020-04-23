package com.example.aosalgaworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aosalgawors.domain.model.Client;

@RestController
public class ClientController {
  @GetMapping("/clients")
  public List<Client> list() {
    var client1 = new Client();
    client1.setId(1L);
    client1.setName("Andre oliveira-");
    client1.setPhone("69993685534");
    client1.setEmail("desmonplays@gmail.com");

    var client2 = new Client();
    client2.setId(2L);
    client2.setName("Karine");
    client2.setPhone("69992181850");
    client2.setEmail("karineamorimdasilva@gmail.com");

    return Arrays.asList(client1, client2);
  }
}
