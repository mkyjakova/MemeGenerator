package cz.czechitas.webapp.controller;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class MemeGeneratorController{

    private static final List<String> vyroky = Arrays.asList(
            "Be a pineapple: stand tall, wear a crown, and be sweet on the inside.",
            "My fake plants died because I did not pretend to water them.",
            "I am not a vegetarian because I love animals. I'm a vegetarian because I hate plants.",
            "Plant lady is the new cat lady.",
            "Maybe actually plants are farming us, giving us oxygen until we eventually decompose and they can consume us.",
            "It's amazing how potatoes give us chips, fries and vodka. Get your shit together, every other vegetable.",
            "If money is made of paper doesn't it mean money grows on trees?",
            "Friends are like trees. They fall down if you hit them multiple times with an axe."
            
    );
    private static final List<Integer> cisla= Arrays.asList(
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8
    );

    @RequestMapping("/meme.html")
    public ModelAndView zobrazMeme(){
        ModelAndView drzakNaDataJmenoStranky;
        Collections.shuffle(cisla);
        
        drzakNaDataJmenoStranky = new ModelAndView("index");
        drzakNaDataJmenoStranky.addObject("obrazek",1);

        int nahodneCisloKytky1 = cisla.get(0);
        drzakNaDataJmenoStranky.addObject("obrazek1", nahodneCisloKytky1);

        int nahodneCisloKytky2 = cisla.get(1);
        drzakNaDataJmenoStranky.addObject("obrazek2", nahodneCisloKytky2);



        int nahodneCisloVyroku1 = cisla.get(2);
        int nahodneCisloVyroku2 = cisla.get(3);

        String vyrok1;
        vyrok1= new String();
        vyrok1 = vyroky.get(nahodneCisloVyroku1);

        drzakNaDataJmenoStranky.addObject("vyrok1", vyrok1);

        String vyrok2;
        vyrok2= new String();
        vyrok2 = vyroky.get(nahodneCisloVyroku2);

        drzakNaDataJmenoStranky.addObject("vyrok2", vyrok2);


        return  drzakNaDataJmenoStranky;
    }
}