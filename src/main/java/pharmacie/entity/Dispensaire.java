package pharmacie.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Setter;
import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Dispensaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @NonNull
	@Column(unique=true, length = 5)
    private String code;

    @NonNull
	@Column(unique=true, length = 40)  
    private String nom;

    @NonNull
	@Column(unique=true, length = 30)
    private String contact;

    @NonNull
	@Column(unique=true, length = 24)
    private String telephone;

    @NonNull
    @Column(unique=true, length = 30)
    private String fonction;

    @NonNull
    @Column(unique=true, length = 24)
    private String fax;

    @Embedded 
    private AdressePostale adressePostale;
    
}
