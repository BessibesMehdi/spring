package pharmacie.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.math.BigDecimal;
import org.h2.command.Command;

@Entity
@Getter @Setter  @ToString


public class Ligne {
    private int quantite;
    private Medicament medicament;
    private Commande commande;
    public Ligne(int quantite, Medicament medicament, Commande commande) {
        this.quantite = quantite;
        this.medicament = medicament;
        this.commande = commande;
    }
    
    public Medicament getMedicament() {
        return medicament;
    }

    public Commande getCommande() {
        return commande;
    }

}
