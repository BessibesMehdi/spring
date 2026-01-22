package pharmacie.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pharmacie.entity.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {
	/**
	 * Recherche les commandes saisies après une date donnée.
	 * @param saisieLeDate date seuil (exclusive)
	 * @return commandes dont la date de saisie est postérieure
	 */
	List<Commande> findBySaisieLeAfter(Date saisieLeDate);
}

