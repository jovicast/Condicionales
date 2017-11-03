/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;


/**
 *
 * @author LAB07
 */
public class Calificacion2 
{
 public static void main(String[] args)
 {
 float nota;
 
  nota = Float.parseFloat(JOptionPane.showInputDialog("ingresa una nota"));
  
     int nota =;
     int notable;
     int bien;
     int sufiente;
     int insuficiente;
     
  if (nota == 7)
      {
     JOptionPane.showMessageDialog(null, " notable");   
      }
  else{
       
      if (nota == 6)
      {
          
       JOptionPane.showMessageDialog(null, "bien");     
      }
       else
       {
        if(nota>4 && nota<5)
               
       JOptionPane.showMessageDialog(null, "suficiente");     
       } 
      
      
 }
}     