package pharmacie.entity;

import java.util.ArrayList;
import java.util.List;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor
public class Dispensaire {
    @Id
    @Setter
    @NonNull
    @Column(length = 5)
    private String code;

    @NotBlank
    @Size(max = 40)
    @Column(length = 40)
    private String nom;

    @NotBlank
    @Size(max = 30)
    @Column(length = 30)
    private String contact;

    @NotBlank
    @Size(max = 24)
    @Column(length = 24)
    private String telephone;

    @NotBlank
    @Size(max = 30)
    @Column(length = 30)
    private String fonction;

    @NotBlank
    @Size(max = 24)
    @Column(length = 24)
    private String fax;

    @Embedded
    private AdressePostale adressePostale;

    @OneToMany(mappedBy = "dispensaire")
    @ToString.Exclude
    private List<Commande> commandes = new ArrayList<>();
    
}
