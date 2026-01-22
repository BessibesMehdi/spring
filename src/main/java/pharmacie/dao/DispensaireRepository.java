package pharmacie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pharmacie.entity.Dispensaire;

public interface DispensaireRepository extends JpaRepository<Dispensaire, String> {
	/**
	 * Trouve tous les dispensaires situés dans une région donnée (adresse postale embarquée).
	 * @param region nom de la région recherchée
	 * @return les dispensaires dont l'adresse postale référence cette région
	 */
	List<Dispensaire> findByAdressePostaleRegion(String region);
}
