package pharmacie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pharmacie.entity.Ligne;

public interface LigneRepository extends JpaRepository<Ligne, Long> {
	/**
	 * Récupère les lignes associées à une commande donnée.
	 * @param commandeNumero identifiant de la commande
	 * @return les lignes de cette commande
	 */
	List<Ligne> findByCommandeNumero(Integer commandeNumero);
}
