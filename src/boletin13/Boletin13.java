package boletin13;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Boletin13 {


    public static void main(String[] args) {
        ConversorTemperatura CT1 = new ConversorTemperatura();
        try {
            CT1.centigradosAFharenheit();
        } catch (TemperaturaErradaExcepcion ex) {
            Logger.getLogger(Boletin13.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            CT1.centigradosAReamur();
        } catch (TemperaturaErradaExcepcion ex) {
            Logger.getLogger(Boletin13.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
