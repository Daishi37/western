package com.company.example;

import java.util.Scanner;
import java.util.*;

public class Dame extends Humain {

    private String couleur_robe;
    private String etat_robe;


    public Dame (String nom){
        super(nom);
        this.couleur_robe = "blanche";
        boisson = "lait";
    }

    public String getCouleurRobe(){
        return couleur_robe;
    }

    public String getEtatRobe(){
        return etat_robe;
    }

    public void se_presente() {
        super.se_presente();
        parle("J'ai une belle robe " + couleur_robe + ".");
    }

    public void changer_robe(String new_robe){

        couleur_robe = new_robe;
        parle("Regardez ma nouvelle robe "+new_robe);
    }

    public void kidnapper(){

        parle("OOOOOOH ! Je me suis fais kidnapper");
    }

    public void se_faire_liberer (Cowboy _nom){

        parle("Merci "+_nom.quel_est_votre_nom()+" de m'avoir liberer");
    }

    public String quel_est_votre_nom(){
        return "Miss "+ nom ;
    }


}


