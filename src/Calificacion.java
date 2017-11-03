/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author LAB07
 */
public class Calificacion
{
   public static void main(String[] args)
    {
    float nota1, nota2, nota3, promedio = 0; 
    
    
    nota1 = Float.parseFloat(JOptionPane.showInputDialog("ingresa un nota1"));
    nota2 = Float.parseFloat(JOptionPane.showInputDialog("ingresa otro nota2"));
    nota3 = Float.parseFloat(JOptionPane.showInputDialog("ingresa otro nota3"));
    promedio= (nota1+nota2+nota3)/3;
    
    
  if(promedio > 4)//Aqui va una condicion
        
    {
      //Si la condicion se cumple se ejecuta este codigo
      JOptionPane.showMessageDialog(null, "Aprobado");
    }   
     
  else
  {
         //Si la condicion se cumple se ejecuta este codigo
     JOptionPane.showMessageDialog(null, "Reprobado"); 
    }     
    }
    }
