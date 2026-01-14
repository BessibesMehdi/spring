package pharmacie.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.*;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;
import lombok.AccessLevel;

import java.math.BigDecimal;

@Entity
@Getter @Setter @ToString
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
    private String destinataire;
    
    @Embedded 
    private AdressePostale adresseLivraison;

    public Commande(Date saisieLe, Date envoyeLe, BigDecimal port, BigDecimal remise, String destinataire) {
        this.saisieLe = saisieLe;
        this.envoyeLe = envoyeLe;
        this.port = port;
        this.remise = remise;
        this.destinataire = destinataire;
    }


   
}
