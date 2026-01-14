package pharmacie.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable

public class AdressePostale {
    @NonNull
	@Column(unique=true, length = 60)
    private String adresse;

    @NonNull
	@Column(unique=true, length = 15)
    private String ville;

    @NonNull
	@Column(unique=true, length = 10)
    private String codePostal; 

    @NonNull
	@Column(unique=true, length = 15) 
     private String pays;


    @NonNull
	@Column(unique=true, length = 15)
    private String region;

    
}
