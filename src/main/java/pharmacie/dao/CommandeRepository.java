package pharmacie.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


import pharmacie.entity.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {
	/**
	 * Recherche une commande par son numéro (unique)
	 * @param numero le numéro recherché
	 * @return Une commande avec ce numéro
	 */
	Categorie findByLibelle(String libelle);
	/**
	 * Recherche les catégories dont le libellé contient une sous-chaine
	 * @param substring la sous-chaine à rechercher dans le libellé
	 * @return la liste des catégories dont le libellé contient substring
	 */
	List<Categorie> findByLibelleContaining(String substring);
}

