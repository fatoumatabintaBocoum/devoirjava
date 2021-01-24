/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Models.Classe;
import Models.Etudiant;
import Models.Personne;
import Models.Professeur;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class DaoPersonne implements IDao<Personne> {
    private final String SQL_SELECT_BY_CLASSE="select * from personne where type='Etudiant' and classe_id=?";
    //A farire sur SQL
    private final String SQL_INSERT="INSERT INTO `personne` ( `nom_complet`, `type`, `tuteur`, `modules`, `grade`, `classe_id`) VALUES (?,?,?,?,?,?);";
    private final String SQL_SELECT_PROFESSEUR="select * from personne where matricule=?";
    private final String SQL_SELECT_ALL_PROFESSEUR="select * from personne where type='Professeur'";
    private final String SQL_SELECT_CONNECT="select * from personne where login=? and pwd=?";
    private DaoMysql mysql;

    public DaoPersonne() {
        mysql=new DaoMysql();
    }
    
    public List<Personne> findByClasse(Classe classe){
        List<Personne> lEtudiants=new ArrayList<>();
    }
        public Professeur findProfesseurByMatricule(String matricule ){
                Professeur professeur=null;
        
                
                
        
        try {
            //Ouvrir La connexion
        mysql.ouvrirConnexionBD();
        //Preparer Requete
        mysql.preparerRequete(SQL_SELECT_BY_CLASSE);
            mysql.getPs().setInt(1, classe.getId());
            //Execution de la Requete
            ResultSet rs=mysql.executeSelect();
            if(rs.next()){
                
                professeur=new Professeur();
                
                professeur.setId(rs.getInt("id"));
                professeur.setNomComplet(rs.getString("nom_complet"),);
                professeur.setGrade(rs.getString("grade"),);
                professeur.setMatricule(rs.getString("matricule"),);
                professeur.setModules(
                        Convert.stringTolist
                        (rs.getString("modules"))
                );
                
                
            }
            //Recueperation des informations de la Requete
            while(rs.next()){
                Etudiant etu=new Etudiant();
                etu.setNomComplet(rs.getString("nom_complet"));
                etu.setId(rs.getInt("id"));
                etu.setTuteur(rs.getString("tuteur"));
            }
        } 

            catch (SQLException ex) {
            Logger.getLogger(DaoPersonne.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return lEtudiants;
    }
     public Professeur findProfesseurByMatricule(String matricule){
        Professeur professeur=null;
        //Recherche
        return professeur;
    }
    
    public List<Professeur> findProfesseur(){
        List<Professeur> lProfesseurs=new ArrayList();
        //Récuperer des Professeurs 
        return lProfesseurs;
    }
    public Personne findUserConnect(String login,String pwd){
        Personne pers=null;
        //Traitement De Connection
        return pers;
    }
    @Override
    public int insert(Personne pers){
        int nbreLigne=0;
            //Traitement Insertion
            return nbreLigne;
    }
    
   
}
