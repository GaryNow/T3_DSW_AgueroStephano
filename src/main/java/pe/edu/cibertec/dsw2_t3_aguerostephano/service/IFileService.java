package pe.edu.cibertec.dsw2_t3_aguerostephano.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IFileService {

    void guardarArchivo(MultipartFile archivo) throws Exception;

    void guardarArchivos(List<MultipartFile> archivosList) throws Exception;
}
