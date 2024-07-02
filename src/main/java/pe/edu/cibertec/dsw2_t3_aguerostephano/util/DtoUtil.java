package pe.edu.cibertec.dsw2_t3_aguerostephano.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.dsw2_t3_aguerostephano.model.Publicacion;
import pe.edu.cibertec.dsw2_t3_aguerostephano.model.dto.DtoEntity;
import pe.edu.cibertec.dsw2_t3_aguerostephano.model.dto.PublicacionDto;

@Component
public class DtoUtil {


    public DtoEntity convertirADto(Object obj, DtoEntity mapper){
        return new ModelMapper().map(obj, mapper.getClass());
    }
    public Object convertirDtoAEntity(Object obj, DtoEntity mapper){
        return new ModelMapper().map(mapper, obj.getClass());
    }

    public PublicacionDto convertirPublicacionAPublicacionDto(Publicacion publicacion) {
        PublicacionDto publicacionDto = new ModelMapper().map(publicacion, PublicacionDto.class);
        publicacionDto.setNomAutor(publicacion.getAutor().getNomAutor());
        publicacionDto.setApeAutor(publicacion.getAutor().getApeAutor());
        return publicacionDto;
    }
}
