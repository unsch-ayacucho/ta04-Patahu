/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author patro
 */
public class Ejercicio002 {
    public static void main(String[] args) {
        int sumaF=0;
        int sumaC=0;
        int referencia=0;
        int numero=0;
        int[ ][ ] listaAleatorios=new int[4][5]; 
        for(int i=0;i<4;i++){
            sumaC=0;
            System.out.println("---- F :"+(i+1));
            for(int i1=0;i1<5;i1++){
                numero=(int)(Math.random()*100+1);
                System.out.println("C"+(i1+1)+" :"+numero);
                listaAleatorios[i][i1]=numero;
                sumaC+=numero;
            }
            System.out.println("Suma de columnas :"+sumaC);

        }
        for(int a=0;a<5;a++){
            sumaF=0;
            System.out.println("---- F :"+(a+1));
            for(int a1=0;a1<4;a1++){
                sumaF+=listaAleatorios[a1][a];
            }
            System.out.println("Suma de columnas :"+sumaF);
        }
    }
}
