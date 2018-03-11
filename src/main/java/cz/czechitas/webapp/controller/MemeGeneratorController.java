package cz.czechitas.webapp.controller;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class MemeGeneratorController{

    private static final List<String> vyroky = Arrays.asList(
            "Be a pineapple: stand tall, wear a crown, and be sweet on the inside",
            "My fake plants died because I did not pretend to water them",
            "I am not a vegetarian because I love animals. I'm a vegetarian because I hate plants.",
            "Plant lady is the new cat lady"
            
    );

    @RequestMapping("/meme.html")
    public ModelAndView zobrazMeme(){
        ModelAndView drzakNaDataJmenoStranky;
        drzakNaDataJmenoStranky = new ModelAndView("index");
        drzakNaDataJmenoStranky.addObject("obrazek",1);

        Random generatorNahodnychCiselKytky = new Random();
        int nahodneCisloKytky = generatorNahodnychCiselKytky.nextInt(5)+1;
        drzakNaDataJmenoStranky.addObject("obrazek", nahodneCisloKytky);



        Random generatorNahodnychCiselVyroky = new Random();
        int nahodneCisloVyroku = generatorNahodnychCiselVyroky.nextInt(vyroky.size());

        String vyrok;
        vyrok= new String();
        vyrok = vyroky.get(nahodneCisloVyroku);

        drzakNaDataJmenoStranky.addObject("vyrok", vyrok);


        return  drzakNaDataJmenoStranky;
    }
}