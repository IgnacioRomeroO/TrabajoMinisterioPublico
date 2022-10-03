package com.dinvestigacion.directrizinvestigacion.Controllers;

import com.dinvestigacion.directrizinvestigacion.Models.DirectrizInvestigacion;
import com.dinvestigacion.directrizinvestigacion.Services.DirectrizRelacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/DirectrizRelaciones")
public class DirectrizRelacionController {

    @Autowired
    DirectrizRelacionService directrizRelacionService;

    @RequestMapping("")
    public String directrizRelaciones(@ModelAttribute("directrizRelaciones") DirectrizInvestigacion directrizRelaciones) {

        return "";
    }

    @RequestMapping("/guardarDirectrizRelaciones")
    public String guardarDirectrizRelacion(@ModelAttribute("directrizRelaciones") DirectrizInvestigacion directrizRelaciones) {
        directrizRelacionService.guardarDirectrizRelacion(directrizRelaciones);

        return "";
    }

    @RequestMapping("/editarDirectrizRelaciones/{id}")
    public String editarDirectrizRelacion(@PathVariable("id") Long idDirectrizRelaciones, Model model) {
        DirectrizInvestigacion directrizRelaciones = directrizRelacionService.editarDirectrizRelacion(idDirectrizRelaciones);
        model.addAttribute("directrizInvestigacion", directrizRelaciones);

        return "";
    }

    @RequestMapping("/eliminarDirectrizRelaciones/{id}")
    public String eliminarDirectrizRelacion(@PathVariable("id") Long idDirectrizRelacion){
        directrizRelacionService.eliminarDirectrizRelacion(idDirectrizRelacion);

        return "";
    }
}
