package com.afpa.apihardware.API_HardwareSystem.Controller;

import com.afpa.apihardware.API_HardwareSystem.Repository.Serveur;
import com.afpa.apihardware.API_HardwareSystem.Service.ServeurService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/serveurs")
@EnableScheduling
@AllArgsConstructor
public class ServeurController {


    private ServeurService serveurService;

    @GetMapping
    public ResponseEntity<List<Serveur>> getAllServeurs() {
        return ResponseEntity.ok(serveurService.getAllServeursRepository());
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Serveur>> getServeurById(@PathVariable Long id) {
        return ResponseEntity.ok(Collections.singletonList(serveurService.getServeurRepositoryById(id)));
    }
}

