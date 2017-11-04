/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import javax.swing.JOptionPane;
import java.lang.Math;//Paquete para funciones Matematicas 

/**
 *
 * @author LAB07
 */
public class Semana 
{
public static void main(String[] args)
{
 int numero;   
 
    numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
 //El metodo round es pas redondear un decimal
   switch(numero) 
   {    
       case 1 ://Caso 1 - si el valor es 7
        JOptionPane.showMessageDialog(null,"Lunes");    
        break;
        case 2://Caso 2 - si el valor es 7
        JOptionPane.showMessageDialog(null,"Martes");    
        break;
        case 3://Caso 3 - si el valor es 7
        JOptionPane.showMessageDialog(null,"Miercoles");    
        break;
        case 4://Caso 4 - si el valor es 7
        JOptionPane.showMessageDialog(null,"Jueves");    
        break;
        case 5://Caso 5 - si el valor es 7
        JOptionPane.showMessageDialog(null,"Viernes");    
        break;
        case 6://Caso 6 - si el valor es 7
        JOptionPane.showMessageDialog(null,"Sabado");    
        break;
        case 7://Caso 7 - si el valor es 7
        JOptionPane.showMessageDialog(null,"Domingo");    
        break;
       
   }  
    }          
             
}
