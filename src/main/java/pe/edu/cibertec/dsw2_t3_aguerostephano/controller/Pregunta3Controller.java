package pe.edu.cibertec.dsw2_t3_aguerostephano.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.cibertec.dsw2_t3_aguerostephano.model.dto.ArchivoDto;
import pe.edu.cibertec.dsw2_t3_aguerostephano.service.FileService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("api/pregunta3")
public class Pregunta3Controller {

    private FileService fileService;

    @PostMapping("/filesimages")
    @PreAuthorize("hasRole('GESTOR')")
    public ResponseEntity<ArchivoDto> subirArchivos(@RequestParam("files") List<MultipartFile> multipartFiles) throws Exception{
        fileService.guardarArchivos(multipartFiles);
        return new ResponseEntity<>(ArchivoDto.builder().mensaje("Archivos subidos correctamente").build(), HttpStatus.OK);
    }


}
