package pharmacie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Ligne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @PositiveOrZero
    private int quantite;

    @ManyToOne(optional = false)
    @JoinColumn(name = "medicament_reference")
    @ToString.Exclude
    private Medicament medicament;

    @ManyToOne(optional = false)
    @JoinColumn(name = "commande_numero")
    @ToString.Exclude
    private Commande commande;

    public Ligne(int quantite, Medicament medicament, Commande commande) {
        this.quantite = quantite;
        this.medicament = medicament;
        this.commande = commande;
    }
}
