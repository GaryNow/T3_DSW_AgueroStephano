package pe.edu.cibertec.dsw2_t3_aguerostephano.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PublicacionDto implements DtoEntity{
    private Integer idPublicacion;
    private String titulo;
    private String resumen;
    private Date fechPublicacion;
    private String nomAutor;
    private String apeAutor;
}

