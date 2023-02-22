/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.Tienda.Service;

import com.tienda.Tienda.Entity.Persona;
import com.tienda.Tienda.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Neptune
 */
@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    private PersonaRepository personaRepository;
        
    @Override
    public List<Persona> getAllPersona() {
        return (List<Persona>)personaRepository.findAll();// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Persona getPersonaById(long id) {
        return personaRepository.findById(id).orElse(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}