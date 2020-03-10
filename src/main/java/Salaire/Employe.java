/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salaire;

/**
 *
 * @author alefev02
 */
public abstract class Employe {
    
    private String nom;
    private String prenom;
    private int age;
    private String dateEntree;
    
    public Employe(String nom, String prenom, int age, String dateEntree){
    
}
    public abstract int calculerSalaire();
    
    public abstract String getNom();
        
    
    
    
}

