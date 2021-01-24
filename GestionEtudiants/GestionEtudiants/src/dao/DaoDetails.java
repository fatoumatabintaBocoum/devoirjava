/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Models.Details;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DaoDetails implements IDao<Details> {
    //A Faire Sur La BD
    private final String SQL_INSERT="INSERT INTO `detail` (`classe_id`, `professeur_id`, `annee`, `module`) VALUES (?, ?, ?, ?);";
    private final String SQL_SELECT_MODULES="select * from details professeur_id=? and classe_id=?";
    @Override
    public int insert(Details detail){
        int nbreLigne=0;
        //Traitement insertion
        return nbreLigne;
    }
   
    public List<String> findModules(Details details){
        List<String> lModules=new ArrayList ();
        
        return lModules;
    }
}
