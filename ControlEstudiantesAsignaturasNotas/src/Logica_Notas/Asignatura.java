
package Logica_Notas;

public class Asignatura {
    //variables del objeto Asignatura
    private int consecutivo;
     private String codprograma;
    private int codmateria;
    private String nombreMateria;
    
    public Asignatura(){}
    public Asignatura(int cons,String codcarrera,int codarea,String nommater){//CONSTRUCTOR de la clase Asignatura que recibira como parametro los datos leidos en archivo de Asignaturas
        this.consecutivo=cons;
        this.codprograma=codcarrera;
        this.codmateria=codarea;
        this.nombreMateria=nommater;
    }
    //------------------------------------getter's y settr's de las variables encapsuladas en la clase ------------------------------------
public int getconsecutivo(){
    return this.consecutivo;
}
    public String getCodcarrera() {
        return codprograma;
    }

    public void setCodcarrera(String codcarrera) {
        this.codprograma = codcarrera;
    }

    public int getCodmateria() {
        return codmateria;
    }

    public void setCodmateria(int codmateria) {
        this.codmateria = codmateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
  
}
