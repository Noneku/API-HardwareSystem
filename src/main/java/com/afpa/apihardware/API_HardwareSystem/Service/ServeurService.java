package com.afpa.apihardware.API_HardwareSystem.Service;

import com.afpa.apihardware.API_HardwareSystem.Repository.ServeurRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ServeurService {

    private final List<ServeurRepository> ServeurRepository = new ArrayList<>();
    private final Random random = new Random();

    public ServeurService() {
        // Initialisation des données simulées
        ServeurRepository.add(new ServeurRepository(1L, "ServeurRepository 1", "192.168.1.1", "Actif", random.nextDouble() * 100));
        ServeurRepository.add(new ServeurRepository(2L, "ServeurRepository 2", "192.168.1.2", "Inactif", random.nextDouble() * 100));
        ServeurRepository.add(new ServeurRepository(3L, "ServeurRepository 3", "192.168.1.3", "Actif", random.nextDouble() * 100));
    }

    public List<ServeurRepository> getAllServeursRepository() {
        return ServeurRepository;
    }

    public ServeurRepository getServeurRepositoryById(Long id) {
        // Exemple de méthode pour récupérer un ServeurRepository par son ID
        return ServeurRepository.stream()
                .filter(ServeurRepository -> ServeurRepository.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    private double roundToOneDecimal(double value) {
        return Math.round(value * 10.0) / 10.0; // Arrondi à 1 chiffre après la virgule
    }

    @Scheduled(fixedRate = 5000)
    public void updateServeurRepositoryChargeCpu() {
        // Exemple de méthode pour mettre à jour la charge CPU de manière simulée
        for (ServeurRepository Serveur : ServeurRepository) {
            double chargeCpu = random.nextDouble() * 80 + 20;
            Serveur.setChargeCpu(roundToOneDecimal(chargeCpu));
        }
    }
}

