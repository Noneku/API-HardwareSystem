package com.afpa.apihardware.API_HardwareSystem.Repository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Serveur {

        private Long id;
        private String nom;
        private String adresseIp;
        private String statut;
        private double chargeCpu;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getAdresseIp() {
            return adresseIp;
        }

        public void setAdresseIp(String adresseIp) {
            this.adresseIp = adresseIp;
        }

        public String getStatut() {
            return statut;
        }

        public void setStatut(String statut) {
            this.statut = statut;
        }

        public double getChargeCpu() {
            return chargeCpu;
        }

        public void setChargeCpu(double chargeCpu) {
            this.chargeCpu = chargeCpu;
        }
    }
