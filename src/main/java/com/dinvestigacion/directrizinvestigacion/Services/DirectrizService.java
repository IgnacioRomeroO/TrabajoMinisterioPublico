package com.dinvestigacion.directrizinvestigacion.Services;


import com.dinvestigacion.directrizinvestigacion.Models.DirectrizInvestigacion;
import com.dinvestigacion.directrizinvestigacion.Repository.DirectrizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectrizService {

    @Autowired
    DirectrizRepository directrizRepository;

    public void guardarDirectriz(DirectrizInvestigacion directrizInvestigacion) {directrizRepository.save(directrizInvestigacion);
    }

    public void eliminarDirectriz(Long idDirectriz) {
        directrizRepository.deleteById(idDirectriz);
    }


    public DirectrizInvestigacion editarDirectriz(Long idDirectriz) {
        return directrizRepository.findById(idDirectriz).get();
    }


}
