package pharmacie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class AdressePostale {
    @NotBlank
    @Size(max = 60)
    @Column(length = 60)
    private String adresse;

    @NotBlank
    @Size(max = 30)
    @Column(length = 30)
    private String ville;

    @NotBlank
    @Size(max = 10)
    @Column(length = 10)
    private String codePostal;

    @NotBlank
    @Size(max = 30)
    @Column(length = 30)
    private String pays;

    @NotBlank
    @Size(max = 30)
    @Column(length = 30)
    private String region;
}
