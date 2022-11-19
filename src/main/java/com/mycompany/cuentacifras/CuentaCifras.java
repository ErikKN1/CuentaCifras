/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cuentacifras;

import javax.swing.JOptionPane;

/**
 *
 * @author Erik
 */
public class CuentaCifras {

    public static void main(String[] args) {
        int numero;
        do{
            numero=Integer.parseInt( JOptionPane.showInputDialog("Ingresa el numero a evaluar"));
            
        }while(numero<0);
         int NumCifras=ContarCifras(numero);
        if(NumCifras==1){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene "+NumCifras+" cifra");
        }else{
            JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene "+NumCifras+" cifras");
        }
    }
    
    public static int ContarCifras(int numero){
        int contador=0;
        for(int i=numero; i>0;i/=10){
            contador++;
        }
        return contador;
    }
}
