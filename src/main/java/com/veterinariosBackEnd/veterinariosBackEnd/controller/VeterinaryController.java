package com.veterinariosBackEnd.veterinariosBackEnd.controller;

import com.veterinariosBackEnd.veterinariosBackEnd.model.Veterinary;
import com.veterinariosBackEnd.veterinariosBackEnd.resource.Util;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class VeterinaryController {

    @GetMapping("/Vete")
    public ResponseEntity<List<Veterinary>> getVeterinary(@RequestParam int VeterinaryId){
        Util.getInstance();
        return new ResponseEntity<>(Util.getInstance().getValue(VeterinaryId), HttpStatus.OK);
    }

   /*
    http://localhost:8082/Vete?VeterinaryId=207340817

    */


    @GetMapping("/Vete/name")
    public ResponseEntity<String> getVeterinaryName(@RequestParam int VeterinaryId){
        Util.getInstance();
        Veterinary vete = Util.getInstance().getValue(VeterinaryId).get(0);
        if (vete == null){
            return new ResponseEntity<>(null,HttpStatus.OK);
        }else {
            return new ResponseEntity<>(vete.getVetName(), HttpStatus.OK);
        }

    }
    /*
    http://localhost:8082/Vete/name?VeterinaryId=207340817

    */

    @PutMapping("/Vete/save/{veteid}")
    public ResponseEntity<String> veteSave(@PathVariable int veteid, @RequestBody Veterinary vete){
        List<Veterinary> vetery = Util.getInstance().getValue(veteid);
        if (vetery == null){
            vetery = new ArrayList<Veterinary>();
        }
        vetery.add(new Veterinary(vete.getVetId(), vete.getVetName(),vete.getVetSpeciality(),vete.getExperience(),vete.getClinic()));
        Util.getInstance().add(veteid,vetery);
        return new ResponseEntity<>("Success",HttpStatus.OK);
    }

}

/*
http://localhost:8082/Vete/save/1

{
        "vetId" : "207340817",
        "vetName" : "Kevin",
        "vetSpeciality" : "Cann",
        "experience" : "2.0",
        "clinic" : "Central"
}

*/





