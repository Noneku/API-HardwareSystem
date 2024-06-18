package com.afpa.apihardware.API_HardwareSystem.Controller;

import com.afpa.apihardware.API_HardwareSystem.Repository.ServeurRepository;
import com.afpa.apihardware.API_HardwareSystem.Service.ServeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/serveurs")
@EnableScheduling
public class ServeurController {

    @Autowired
    private ServeurService serveurService;

    @GetMapping
    public List<ServeurRepository> getAllServeurs() {
        return serveurService.getAllServeursRepository();
    }

    @GetMapping("/{id}")
    public ServeurRepository getServeurById(@PathVariable Long id) {
        return serveurService.getServeurRepositoryById(id);
    }
}

