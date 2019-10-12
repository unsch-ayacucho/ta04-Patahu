/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import javax.swing.JOptionPane;


public class Ejercicio001 {

    public static void main(String[] args) {
        int maximo=-1;
        int minimo=-1;
        int numero=0;
        String resaltado="";
        int[ ][ ] listaAleatorios=new int[6][10]; 
        for(int i=0;i<6;i++){
            System.out.println("---- F :"+(i+1));
            for(int i1=0;i1<10;i1++){
                numero=(int)(Math.random()*1000);
                System.out.println("C"+(i1+1)+" :"+numero);
                listaAleatorios[i][i1]=numero;
                if(maximo==-1 && minimo==-1){
                    maximo=numero;
                    minimo=numero;
                }
                else if(maximo <= numero){
                    maximo=numero;
                }
                else if(minimo>=numero){
                    minimo=numero;
                }
            }

        }
        System.out.println("Maximo :"+maximo+" Minimo: "+minimo);
        
        for(int a=0;a<6;a++){
            for(int a1=0;a1<10;a1++){
                if(listaAleatorios[a][a1]==maximo){
                    resaltado+=" MAXIMO :"+" Fila: "+a+" Columna: "+a1;
                } 
                else if(listaAleatorios[a][a1]==minimo){
                    resaltado+=" MINIMO :"+" Fila: "+a+" Columna: "+a1;
                }
            }
        }
                System.out.println(resaltado);
    }
}
