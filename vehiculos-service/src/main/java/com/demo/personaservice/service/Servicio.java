package com.demo.personaservice.service;


import com.demo.personaservice.model.TblVehiculo;
import com.demo.personaservice.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicio {

    @Autowired
    private Repository vehiculoRepository;

    public TblVehiculo guardarVehiculo(TblVehiculo persona)
    {
        TblVehiculo personaGuarada= vehiculoRepository.save(persona);
        return personaGuarada;
    }

    public TblVehiculo modificarVechiculo(Integer id, TblVehiculo persona)
    {
        TblVehiculo personeExistente= vehiculoRepository.findById(id).orElseThrow();
        persona.setId(id);
        TblVehiculo personaGuarada= vehiculoRepository.save(persona);
        return personaGuarada;
    }

    public List<TblVehiculo> listarVehiculo()
    {
        List<TblVehiculo> lista= vehiculoRepository.findAll();

        return lista;
    }

}
