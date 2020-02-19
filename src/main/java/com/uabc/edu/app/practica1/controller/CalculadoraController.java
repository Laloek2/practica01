package com.uabc.edu.app.practica1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
    @GetMapping("/")
    public String saludito(){
        return "<b>Holis!!!</b>";
    }
    @GetMapping("/suma")
    public float suma(@RequestParam(value="NumA") float a,@RequestParam(value="NumB") float b){
        return(a+b);
    }
    @GetMapping("/resta")
    public float resta(@RequestParam(value="NumA") float x,@RequestParam(value="NumB") float y){
        return (x-y);
    }
    @GetMapping("/mult")
    public float multiplicacion(@RequestParam(value="NumA") float x,@RequestParam(value="NumB") float y){
        return(x*y);
    }
    @GetMapping("/div")
    public float divicion(@RequestParam(value="NumA") float x,@RequestParam(value="NumB") float y){
        return (x/y);
    }
    @GetMapping("/residuo")
    public float residuo(@RequestParam(value="NumA") float x,@RequestParam(value="NumB") float y){
        return (x%y);
    }
    @GetMapping("/cuadrado")
    public float cuadrado(@RequestParam(value="NumA") float x){
        return (x*x);
    }
    @GetMapping("porcentaje")
    public float porcentaje(@RequestParam(value="NumA") float x,@RequestParam(value="NumB") float y){
        return x*(y/100);
    }
}