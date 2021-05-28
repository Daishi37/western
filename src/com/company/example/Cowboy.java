package com.company.example;

import java.util.Scanner;
import java.util.*;

public class Cowboy extends Humain {

    private int populaire;
    private String caractere;


    public Cowboy (String nom){
        super(nom);
        this.populaire = 0;
        this.caractere = "vaillant";
        boisson = "whisky";
    }

    public String quel_est_votre_nom(){
        return nom;
    }

    public void se_presente() {
        super.se_presente();
        parle("Ils disent de moi que je suis "+caractere);
    }

    public void tirer(Brigand _nom) {

        System.out.println("Le "+caractere+" Cowboy "+nom+" tire sur  "+_nom.quel_est_votre_nom()+". PAN !");
        parle("Prend ça, rascal !");
    }

}


