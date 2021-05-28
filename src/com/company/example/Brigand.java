package com.company.example;

import java.util.Scanner;
import java.util.*;

public class Brigand extends Humain {

    private String look;
    private int nb_dame;
    private String recompense;
    boolean en_prison;

    public Brigand (String nom){
        super(nom);
        this.look = "méchant";
        this.recompense = "100$";
        this.en_prison = false;
        this.nb_dame = 0;
        boisson = "Ricard";
    }

    public String getLook(){
        return look;
    }

    public String getRecompense(){
        return recompense;
    }

    public void a_kidnapper (Dame _nom) {

        nb_dame++;
        System.out.println("Oh mon Dieu ! " + nom + " a enleve " + _nom.quel_est_votre_nom()+ " !!");
        parle("Ah ah "+_nom.quel_est_votre_nom()+", tu es mienne désormais !");
        _nom.kidnapper();
    }

    public void est_emprisonne (Cowboy _nom) {

        en_prison = true;
        parle("Damned, je suis fait ! "+_nom.quel_est_votre_nom()+", tu m'as eu !");
    }

    public void recompense_obtenue () {

        en_prison = true;
        parle("Il m'a eu et obtient "+recompense);
    }

    public void se_presente() {
        super.se_presente();
        parle("J'ai un "+look+" look et j'ai capturé "+nb_dame);
    }

    public String quel_est_ton_nom(){
        return nom + look;
    }


}



