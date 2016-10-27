/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author freddy
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Personal[] p = new Personal[10];  
    Campaña[] campañas = new Campaña[10];
    Personal p1 = new Personal("ab", "cd", 100, "Jefe", null);
    Cliente c = new Cliente("fg", "strasse", null);
    p[0] = p1;
    
    c.setContacto(p);
    p1.setCliente(c);
    
    System.out.println(Arrays.toString(c.getContacto()));
    System.out.println(p1.getCliente());
    
    ArrayList<String> nota = new ArrayList<String>();
    nota.add("algo");
    nota.add("datos");
    p1.setNotas(nota);
    System.out.println(p1.getNotas().get(0));
    //System.out.println(Arrays.toString(c.getContacto()));
    
    Campaña elecciones = new Campaña("USA", "08/05/2016", "08/11/2016", 50000,1500000, 2500000 );
    campañas[0] = elecciones;
    
    c.setCampañas(campañas);
    System.out.println(c.getCampañas());
    
    System.out.println(elecciones.presupuesto());
    
    
    
    }
        
    
}
