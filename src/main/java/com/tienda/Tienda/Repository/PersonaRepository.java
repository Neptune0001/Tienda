/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.Tienda.Repository;

import com.tienda.Tienda.Entity.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Neptune
 */
public interface PersonaRepository extends CrudRepository<Persona,Long> {
    Persona findByNombre(String nombre);
}
