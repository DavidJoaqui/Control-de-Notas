
package Logica_Notas;
import Archivos.Archivos;
public class Estudiante {
    //variables del objeto Estudiante
    private int consecutivo;
    private long identificacion;
    private String nombre;
    private String apellido;
     private int codigo;
     
public Estudiante(){}
    public Estudiante(int cons,long numid,String nom, String ap, int cod ){//constructor de la clase Estudiante que recibira como parametro los datos lleidos en el archivo de Estudiante
        
       this.consecutivo=cons;
        this.identificacion=numid;
        this.nombre=nom;
        this.apellido=ap;
        this.codigo=cod;
    }
        //------------------------------------getter's y settr's de las variables encapsuladas en la clase ------------------------------------
    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
