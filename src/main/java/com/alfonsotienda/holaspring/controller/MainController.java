package com.alfonsotienda.holaspring.controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.property.ResourceExistsPropertyDefiner;

/**
 * MainController
 */

@Controller
public class MainController {




    @GetMapping("/test")
    @ResponseBody
    public String testdelocura(@RequestParam("opcion1") String opcion1, @RequestParam("opcion2") String opcion2,
            @RequestParam("opcion3") String opcion3, @RequestParam("opcion4") String opcion4) {
    int suma=0;
    String respuesta1= "nunca";
    String respuesta2= "una vez al año ";
    String respuesta3= "a menudo";
    String respuesta4= "son las 3 menos cuarto";

    System.out.println("¿CON QUE FRECUENCIA TE DICEN QUE ESTAS LOCO?");
    
    if (respuesta.equals(respuesta1) ){
            suma =2;}
        else if (respuesta.equals(respuesta2)){
            suma =5;}
        else if (respuesta.equals(respuesta3)){
            suma =8;}
        else if (respuesta.equals(respuesta4)){
            suma =10;}
    }
    





    }



    @GetMapping("/nuevo")
    public ModelAndView helloHTML() {
        ModelAndView respuesta = new ModelAndView("hello");
        String msg = "Hola mundo html";
        respuesta.addObject("mensaje", msg);
        return respuesta;
    }
}
