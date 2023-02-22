/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.Tienda.Service;

import com.tienda.Tienda.Entity.Persona;
import java.util.*;

/**
 *
 * @author Neptune
 */
public interface IPersonaService {
    public List<Persona> getAllPersona();
    public Persona getPersonaById (long id);
    public void savePersona(Persona persona);
    public void delete(long id);
}
