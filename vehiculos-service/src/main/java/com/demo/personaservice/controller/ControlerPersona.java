package com.demo.personaservice.controller;


import com.demo.personaservice.model.TblVehiculo;
import com.demo.personaservice.service.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/{$versionapi}/vehiculo")
public class ControlerPersona {

    @Autowired
    private Servicio servicio;

    @PostMapping("/save")
    public ResponseEntity<?> guardarPersona(@RequestBody TblVehiculo persona){

        Map<String,Object> response= new HashMap<>();
        if(persona==null)
        {
            return  new ResponseEntity<>("La vehiculo esta vacia", HttpStatus.CONFLICT);
        }
        TblVehiculo guardado=servicio.guardarVehiculo(persona);
        response.put("data",guardado);

        return  new ResponseEntity<>(response, HttpStatus.OK);

    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> modificarPersona(@PathVariable Integer id,@RequestBody TblVehiculo persona){

        Map<String,Object> response= new HashMap<>();

        TblVehiculo guardado=servicio.modificarVechiculo(id,persona);
        response.put("data",guardado);

        return  new ResponseEntity<>(response, HttpStatus.OK);

    }
    @GetMapping("/all")
    public ResponseEntity<?> obtenerPersonas(){

        Map<String,Object> response= new HashMap<>();

        List<TblVehiculo> lista=servicio.listarVehiculo();
        response.put("data",lista);

        return  new ResponseEntity<>(response, HttpStatus.OK);

    }


}
