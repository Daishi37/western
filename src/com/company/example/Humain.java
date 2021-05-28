package com.company.example;

import java.util.Scanner;
import java.util.*;

public class Humain {

 protected String nom;
 protected String boisson;

 public Humain (String _nom){
  this.nom = _nom;
  this.boisson = "eau";
 }

 public String getNom(){
  return nom;
 }

 public String getBoisson(){
  return boisson;
 }

 public void parle(String texte){

  System.out.println("("+nom+") - "+texte);
 }

 public void se_presente(){

  parle("Bonjour je suis "+nom+" ! Ah ! un bon verre de "+boisson+" ! hop cul-sec !");
 }

 public String quel_est_votre_nom (){

  return nom;
 }


}


