package com.dinvestigacion.directrizinvestigacion.Controllers;

import com.dinvestigacion.directrizinvestigacion.Models.DirectrizInvestigacion;
import com.dinvestigacion.directrizinvestigacion.Services.DirectrizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/DirectrizInvestigacion")
public class DirectrizController {

    @Autowired
    DirectrizService directrizService;


    @RequestMapping("")
    public String directrizInvestigacion(@ModelAttribute("directrizInvestigacion") DirectrizInvestigacion directrizInvestigacion) {

         return "";
    }

    @RequestMapping("/guardarDirectriz")
    public String guardarDirectriz(@ModelAttribute("DirectrizInvestigacion") DirectrizInvestigacion directrizInvestigacion) {
        directrizService.guardarDirectriz(directrizInvestigacion);

        return "";
    }

    @RequestMapping("/editarDirectriz/{id}")
    public String editarDirectriz(@PathVariable("id") Long idDirectriz, Model model) {
        DirectrizInvestigacion directrizInvestigacion = directrizService.editarDirectriz(idDirectriz);
        model.addAttribute("directrizInvestigacion", directrizInvestigacion);

        return "";
    }

    @RequestMapping("/eliminarDirectriz/{id}")
    public String eliminarDirectriz(@PathVariable("id") Long idDirectriz){
        directrizService.eliminarDirectriz(idDirectriz);

        return "";
    }


}
