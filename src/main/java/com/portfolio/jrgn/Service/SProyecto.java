/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jrgn.Service;

import com.portfolio.jrgn.Entity.Proyecto;
import com.portfolio.jrgn.Repository.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gaston
 */
@Transactional
@Service
public class SProyecto {
    @Autowired
    RProyecto rproyecto;
    
    public List<Proyecto> list(){
        return rproyecto.findAll();
    }
    
    public Optional<Proyecto> getOne(int id){
        return rproyecto.findById(id);
    }
    
    public Optional<Proyecto> getByNombre(String nombre){
        return rproyecto.findByNombre(nombre);
    }
    
    public void save(Proyecto proyecto){
        rproyecto.save(proyecto);
    }
    
    public void delete(int id){
        rproyecto.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rproyecto.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rproyecto.existsByNombre(nombre);
    }
}