/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;
import java.lang.Math;//Paquete para funciones Matematicas 
/**
 *
 * @author LAB07
 */
public class SwitchNotas 
{
   public static void main(String[] args)
   {
    float nota = Float.parseFloat(JOptionPane.showInputDialog("ingrese una nota"));
    //El metodo round es pas redondear un decimal
    switch(Math.round(nota))
    {
        case 7://Caso 1 - si el valor es 7
        JOptionPane.showMessageDialog(null,"Notable");    
        break;
        case 6://Caso 2 - si el valor es 6
        JOptionPane.showMessageDialog(null,"Bien");    
        break;
        case 5://Caso 3 - si el valor es 5
        JOptionPane.showMessageDialog(null,"Suficiente");    
        break;
        case 4://Caso 4 - si el valor es 4
        JOptionPane.showMessageDialog(null,"Suficiente");    
        break;
        default:
          JOptionPane.showMessageDialog(null,"Insuficiente");
          break;
    }
       
       
   } 
}
