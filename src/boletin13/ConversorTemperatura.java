package boletin13;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConversorTemperatura {
    private final float grados=80;
    private float t1;

Scanner sc = new Scanner(System.in);
    public ConversorTemperatura() {
    }
    
    public void centigradosAFharenheit() throws TemperaturaErradaExcepcion{
       t1 =Integer.parseInt( JOptionPane.showInputDialog("Introduce la temperatura en Centigrados"));
      
       if(t1<grados)
           throw new TemperaturaErradaExcepcion("La temperatura ha de ser superior a 80");
       float t2 = t1*9/5+(float)32.4;
        System.out.println(t2);
    }
    
    public void centigradosAReamur() throws TemperaturaErradaExcepcion {
      if(t1<grados);
        throw new TemperaturaErradaExcepcion("La temperatura ha de ser superior a 80");
        
      //float t3 = t1*(float)(4.0/5.0);
     // System.out.println(t3); 
        }


      
    }
    

    
    
    
    
    
    
    
    

