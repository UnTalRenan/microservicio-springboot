package com.demo.personaservice.service;


import com.demo.personaservice.model.TblPersona;
import com.demo.personaservice.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicio {

    @Autowired
    private Repository personaRepository;

    public TblPersona guardarPersona(TblPersona persona)
    {
        TblPersona personaGuarada=personaRepository.save(persona);
        return personaGuarada;
    }

    public TblPersona modificarPersona(Integer id,TblPersona persona)
    {
        TblPersona personeExistente=personaRepository.findById(id).orElseThrow();
        persona.setId(id);
        TblPersona personaGuarada=personaRepository.save(persona);
        return personaGuarada;
    }

    public List<TblPersona> listarPersonas()
    {
        List<TblPersona> lista=personaRepository.findAll();

        return lista;
    }

}
