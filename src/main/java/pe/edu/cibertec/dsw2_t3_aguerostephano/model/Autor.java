package pe.edu.cibertec.dsw2_t3_aguerostephano.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAutor")
    private Integer idAutor;

    @Column(name = "NomAutor")
    private String nomAutor;

    @Column(name = "ApeAutor")
    private String apeAutor;

    @Column(name = "FechNacAutor")
    private Date fechNacAutor;

}
