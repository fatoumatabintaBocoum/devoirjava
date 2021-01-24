/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cour;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author DELL
 */
public class Exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Creer une Liste String
        Ajouter des elements
        supprimer des elements
        affichage de la liste
        modifier un element de la liste
        rechercher un element de la liste
        */
        // Creer une Liste String
    List<String> lString=new ArrayList();
    
    //Ajouter des elements
    lString.add("Bonjour");
    lString.add("Au Revoir");
    lString.add("Les Etudiant de la Lige 3");
    
    // affichage de la liste
      //Methode1 Obsoléte
        for(String elt:lString){
            System.out.println(elt);
        }
       //Methode2 Bonne méthode
       lString.add(0, "Debut" );
        lString.forEach((elt) -> {
            System.out.println(elt);
        });
    //supprimer des elements
    lString.remove("Debut");// Supprimer a partir de l'element
    lString.remove(2);// Supprimer à partir d'une position
    System.out.print("Affichage apres Suppression");
    lString.forEach((elt) -> {
            System.out.println(elt);
        });
    
    //Modifier un elemnt de la liste
    lString.set(0,"Bonsoir");
    System.out.print("Affichage apres Modification");
    lString.forEach((elt) -> {
            System.out.println(elt);
        });
    //Rechercher un element dans Liste
    if(lString.contains("Bonsoir")==true){
        System.out.print("Element Existe");
    }else{
        System.out.print("Element Existe pas");
    }
        
    }
   
    
    
}
