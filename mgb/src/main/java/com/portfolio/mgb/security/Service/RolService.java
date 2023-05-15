/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgb.security.Service;

import com.portfolio.mgb.security.Entity.Rol;
import com.portfolio.mgb.security.Enums.RolNombre;
import com.portfolio.mgb.security.Repository.RolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.finByRolNombre(rolNombre);
    }
    
    public void save (Rol rol){
        rolRepository.save(rol);
    }
}
