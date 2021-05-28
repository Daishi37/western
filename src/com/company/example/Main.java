package com.company.example;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main (String [] args) {

        String texte;

        Scanner sc = new Scanner(System.in);
        System.out.println("");

        Brigand B1 = new Brigand("Micah");
        Dame D1 = new Dame("Abigail");
        Cowboy C1 = new Cowboy ("John Marston");
        Barman Ba1 = new Barman ("Robert");


        B1.se_presente();
        System.out.println("");

        D1.se_presente();
        System.out.println("");

        C1.se_presente();
        System.out.println("");



        B1.a_kidnapper(D1);
        System.out.println("");

        D1.kidnapper();
        System.out.println("");

        C1.tirer(B1);
        System.out.println("");

        B1.est_emprisonne(C1);
        System.out.println("");

        B1.recompense_obtenue();
        System.out.println("");

        D1.se_faire_liberer(C1);
        System.out.println("");

        Ba1.se_presente();
        System.out.println("");

    }

}


