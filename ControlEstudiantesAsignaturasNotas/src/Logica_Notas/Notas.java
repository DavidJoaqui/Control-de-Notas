
package Logica_Notas;

import java.io.IOException;

public class Notas {
    //---------variables del objeto Notas---------
     private double nota1;
    private double nota2;
    private double nota3;
    private double definitiva;
    public Notas(){}
    
    public Notas(double n1, double n2, double n3){//constructor de la clase Notas  que recibira como parametro  los datos capturados en la interfaz
        
        this.nota1=n1;
        this.nota2=n2;
        this.nota3=n3;
        
    }
    //------------------------------------getter's y settr's de las variables encapsuladas en la clase ------------------------------------
    public double getNota1() {
        return nota1;
        
    }

    public double getNota2() {
        return nota2;
    }

 

    public double getNota3() {
        return nota3;
    }



    public double getDefinitiva() {
        return definitiva;
    }

    public double CalcularDefinitiva(double n1, double n2, double n3){//metodo en el cual a partir de las notas recibidas como parametro se calcula con unos porcentajes una nota definitiva
     
 Double def=(n1*0.3)+(n2*0.3)+(n3*0.4);
    this.definitiva=def;//asignamos el resultado de la operacion a la variable encapsulada "definitiva"
   return def;//retornamos el resultado para luego mostrarlo
}

}
