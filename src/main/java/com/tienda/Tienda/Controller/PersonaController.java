/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.Tienda.Controller;

import com.tienda.Tienda.Entity.Pais;
import com.tienda.Tienda.Entity.Persona;
import com.tienda.Tienda.Service.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Neptune
 */
@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @Autowired
    private IPaisService paisService;

    @GetMapping("/persona")
    public String index(Model model) {
        List<Persona> listaPersona = personaService.getAllPersona();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", listaPersona);
        return "personas";
    }

    @GetMapping("/personaN")
    public String crearPersona(Model model) {
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("persona", new Persona());
        model.addAttribute("paises", listaPaises);
        return "crear";
    }

    //Anterior 21 Febrero-------------------------------------------------------
    @GetMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable("id") Long idPersona) {
        personaService.delete(idPersona);
        return "redirect:/persona";
    }

    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona) {
        personaService.savePersona(persona);
        return "redirect:/persona";
    }

    @GetMapping("/editPersona/{id}")
    public String editarPersona(@PathVariable("id") Long idPersona, Model model) {
        Persona persona = personaService.getPersonaById(idPersona);
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("persona", persona);
        model.addAttribute("paises", listaPaises);
        return "crear";
    }
}
