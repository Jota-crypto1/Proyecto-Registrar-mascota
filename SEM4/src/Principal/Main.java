/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;
//libreria
import Vista.FormMascota;

public class Main {

    public static void main(String[] args) {
        FormMascota fm = new FormMascota();
        fm.setTitle("REGISTRO DE MASCOTA");
        fm.setVisible(true);
        fm.setLocationRelativeTo(null);//lo ubica en el centro de la pantalla
    }
    
}
