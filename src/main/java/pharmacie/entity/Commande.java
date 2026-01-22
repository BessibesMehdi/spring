package pharmacie.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numero = null;
    private Date saisieLe;
    private Date envoyeLe;

    @PositiveOrZero
    private BigDecimal port;

    @PositiveOrZero
    private BigDecimal remise;

    @NotBlank
    private String destinataire;
    
    @Embedded
    private AdressePostale adresseLivraison;

    @ManyToOne(optional = false)
    @JoinColumn(name = "dispensaire_code")
    @ToString.Exclude
    private Dispensaire dispensaire;

    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<Ligne> lignes = new ArrayList<>();

    public Commande(Date saisieLe, Date envoyeLe, BigDecimal port, BigDecimal remise, String destinataire) {
        this.saisieLe = saisieLe;
        this.envoyeLe = envoyeLe;
        this.port = port;
        this.remise = remise;
        this.destinataire = destinataire;
    }


   
}
