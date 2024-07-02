package pe.edu.cibertec.dsw2_t3_aguerostephano.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dsw2_t3_aguerostephano.model.Publicacion;
import pe.edu.cibertec.dsw2_t3_aguerostephano.repository.PublicacionRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class PublicacionService implements IPublicacionService {


    private PublicacionRepository publicacionRepository;

    @Override
    public List<Publicacion> listarPublicaciones() {
        return publicacionRepository.findAll();
    }
}
