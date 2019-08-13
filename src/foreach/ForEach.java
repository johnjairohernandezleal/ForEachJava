/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach;

/**
 *
 * @author john hernandez
 */
public class ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos el arreglo de personas
        Persona[] personas ={new Persona("juan"), new Persona("karla")};
        
        // iteramos cada elemento del arreglo dde personas
        
        for(Persona p : personas){
            // accedemos a los atributos del objeto personas
            String nombre = p.getNombre();
            System.out.println("Nombre de la persona :" + nombre);
        }
        System.out.println("");
        // creamos el arreglo de enteros
        int [] edades = {15,20,41,50};
        for(int edad : edades){
            System.out.println("Edad:" + edad);
            
        }
    }
    
}
