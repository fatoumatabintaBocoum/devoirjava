/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Models.Classe;
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
public class DaoClasse implements IDao<Classe> {
    private final String SQL_INSERT="INSERT INTO `classe` (`libelle`, `nbre_etudiant`) VALUES (?,?);";
    private final String SQL_SELECT_ALL="Select * from classe";
    
    private DaoMysql mysql;

    public DaoClasse() {
        mysql=new DaoMysql();
    }
    
    
    @Override
    public int insert(Classe classe){
        int nbreLigne=0;
        try {
            //Ouvrir la Connexion
            mysql.ouvrirConnexionBD();
            //Preparate Requete
            //1-Passer la Requete
            mysql.preparerRequete(SQL_INSERT);
            //2-(facultative)Injecter Les Variables de la requete
            mysql.getPs().setString(1,classe.getLibelle());
            mysql.getPs().setInt(2, classe.getNbre());
            //Executer la requete
            //Requete de Mise a Jour
            nbreLigne= mysql.executeMisAJour();
        } catch (SQLException ex) {
            Logger.getLogger(DaoClasse.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            mysql.closeConnexion();
        }
        return nbreLigne;
    }
    
    
    public List<Classe> findAll(){
        List<Classe>lClasses=new ArrayList<>();
         
        try {
            //Ouvrir la Connexion
            mysql.ouvrirConnexionBD();
            //Preparate Requete
            //1-Passer la Requete
            mysql.preparerRequete(SQL_SELECT_ALL);
            //Execute de la Requete
            ResultSet rs= mysql.executeSelect();
            //Parcourir le Resultat de la Requete
            while(rs.next()){
                Classe cl= new Classe();
                //Hydrater L'objet Cl
                //BD ---objet
                cl.setId(rs.getInt("id"));
                cl.setLibelle( rs.getString("libelle"));
                cl.setNbre(rs.getInt("nbre_etudiant"));
                lClasses.add(cl);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lClasses;
    }
}
