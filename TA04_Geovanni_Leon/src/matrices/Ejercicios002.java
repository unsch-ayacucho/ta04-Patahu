
package matrices;

public class Ejercicios002 {
    public static void main(String[] args) {
        Alfil al=new Alfil(6,3);
        
    }
    
}

class Alfil{
    private int fila;
    private int columna;
    Alfil(int f, int c){
        this.fila=f;
        this.columna=c;
        movimientos(f,c);
    }
    private void movimientos(int f, int c){
        
        f=f-1;
        c=c-1;
        
        // superior izquierdo
         if(f>c)
            diagonal(c);
         
         else
            diagonal(f);
         //superior derecho
         if((7-f)>c)
             diagonal2(c);
         else
             diagonal2(7-f);
         //inferior izquierdo
         if(f>(7-c)){
             diagonal(7-c);
         }
         else
             diagonal(f);
         //infierior derecho
         if((7-f)>(7-c))
             diagonal(7-c);
         else
             diagonal(7-f);


             
    }
   private void diagonal(int num){
       for(int a=1;a<=num;a++){
           System.out.println(" posiciones en c :"+a);
           System.out.println(" posiciones en f :"+(this.fila-a));
       }    
       System.out.println(num);
   }
   private void diagonal2(int num){
       int fila=this.fila-1;
       for(int a=(num+1);a<=(num+3);a++){
           System.out.println(" posiciones en f :"+a);
           System.out.println(" posiciones en c :"+fila);
           fila--;
       }    
       System.out.println(num);
   }
}
