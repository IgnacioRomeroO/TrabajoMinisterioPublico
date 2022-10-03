package com.dinvestigacion.directrizinvestigacion.Services;

import com.dinvestigacion.directrizinvestigacion.Models.DirectrizInvestigacion;
import com.dinvestigacion.directrizinvestigacion.Repository.DirectrizRelacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectrizRelacionService {

    @Autowired
    DirectrizRelacionRepository directrizRelacionRepository;

    public void guardarDirectrizRelacion(DirectrizInvestigacion directrizRelaciones) {directrizRelacionRepository.save(directrizRelaciones);
    }

    public void eliminarDirectrizRelacion(Long idDirectrizRelaciones) {
        directrizRelacionRepository.deleteById(idDirectrizRelaciones);
    }


    public DirectrizInvestigacion editarDirectrizRelacion(Long idDirectrizRelaciones) {
        return directrizRelacionRepository.findById(idDirectrizRelaciones).get();
    }

}
