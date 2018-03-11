package cz.czechitas.webapp.controller;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class MemeGeneratorController{

    @RequestMapping("/meme.html")
    public ModelAndView zobrazMeme(){

        ModelAndView drzakNaDataJmenoStranky;
        drzakNaDataJmenoStranky = new ModelAndView("index");

        Random generatorNahodnychCisel = new Random();

        int nahodneCislo = generatorNahodnychCisel.nextInt(6)+1;
        drzakNaDataJmenoStranky.addObject("cislo", nahodneCislo);

        return  drzakNaDataJmenoStranky;
    }
}