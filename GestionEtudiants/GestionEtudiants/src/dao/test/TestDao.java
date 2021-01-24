/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.test;

import Models.Classe;
import dao.DaoClasse;
import java.util.List;

/**
 *
 * @author DELL
 */
public class TestDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DaoClasse daoClasse=new DaoClasse();
        Classe classe=new Classe("IDC3", 20);
        daoClasse.insert(classe);
       /* daoClasse.findAll().forEach((classe)->{
            System.out.println(classe);
        });*/
       List<Classe> classes=daoClasse.findAll();
       for(Classe cl:classes){
       System.out.println(cl);
       }
        
       DaoPersonne daopers=new DaoPersonne();
       DaoPers.findByClasse(new Classe(1)).
                            forEach(System.out.println);
       System.out.
               println(daopers.
                       findProfesseurByMatricule("MAT20212")
               );
    }
    
}
