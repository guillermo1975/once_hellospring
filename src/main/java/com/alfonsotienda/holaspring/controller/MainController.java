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

    @GetMapping("/calculadora")
    @ResponseBody
    public String calculadora(@RequestParam("numero1") Double num1,
                            @RequestParam(value ="numero2" , required = false) Double num2 ,
                            @RequestParam("operador")  String operador){
double res =0;
if (operador.equals ("+") || operador.equals("-") || operador.equals("*") || operador.equals("/") || operador.equals("raiz")){

}

else {return "debes utilizar + - * / " ;
}

switch (operador){
case "+":
res = num1 + num2 ;
break;
case "-":
res = num1 - num2 ;
break;
case "*":
res = num1 * num2;
break;
case "/":
res = num1 / num2;
break;
case "raiz":
res = Math.sqrt(num1);
break;

} return " el resultado de " + num1 + " " + operador + " " + num2 + " es " + res;  
      
    } 
   
    @GetMapping("/ingles")
    @ResponseBody
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping("/nuevo")
    public ModelAndView helloHTML (){
    ModelAndView respuesta =new ModelAndView("hello");
    String msg = "Hola mundo html";
    respuesta.addObject("mensaje",msg);
    return respuesta;
    }
}







