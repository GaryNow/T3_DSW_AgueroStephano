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
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPublicacion")
    private Integer idPublicacion;

    @Column(name = "Titulo")
    private String titulo;

    @Column(name = "Resumen")
    private String resumen;

    @Column(name = "FechPublicacion")
    private Date fechPublicacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdAutor", referencedColumnName = "IdAutor", nullable = false)
    private Autor autor;

}