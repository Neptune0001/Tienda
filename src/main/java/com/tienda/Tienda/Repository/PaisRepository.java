/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.Tienda.Repository;
import com.tienda.Tienda.Entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Neptune
 */
@Repository
public interface PaisRepository extends CrudRepository<Pais,Long>{
    
}
