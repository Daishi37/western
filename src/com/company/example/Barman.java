package com.company.example;

import java.util.Scanner;
import java.util.*;

public class Barman extends Humain {

    private int populaire;
    private String bar;


    public Barman (String nom, String _bar){
        super(nom);
        this.bar = _bar;
        boisson = "vin";
        bar = nom;
    }

    public Barman (String nom){
        super(nom);
        bar = nom;
        boisson = "vin";
    }

    public String quel_est_votre_nom(){
        return nom;
    }

    public void se_presente() {
        super.se_presente();
        parle("Je gère mon propre bar Chez "+bar+" Coco.");
    }

    public void servir(Humain _nom) {
        parle("Voilà "+_nom.quel_est_votre_nom()+" met toi à l'aise avec ce "+boisson+" Coco");
    }


}
