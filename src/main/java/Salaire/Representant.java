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
public class Representant extends Employe {
    
    private int CA;

    public Representant(String nom, String prenom, int age, String dateEntree, int CA) {
        super(nom, prenom, age, dateEntree);
        this.CA = CA;
    }

    @Override
    public int calculerSalaire() {
        return (CA*200)/100 + 800;
    }

    @Override
    public String getNom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
