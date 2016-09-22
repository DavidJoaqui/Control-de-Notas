
package Logica_Notas;
import Archivos.Archivos;
import Logica_Notas.Asignatura;
import Logica_Notas.Estudiante;
import Logica_Notas.Notas;
import java.io.IOException;
import  java.util.ArrayList;

public class Registros {
  Archivos arc=new Archivos();  
   Estudiante est=new Estudiante();
        Asignatura asg=new Asignatura();
        Notas nts=new Notas();

 //-----------------------------Listas en las cuales almacenaremos lo leido en los archivos de texto(Estudiante) y (Asignaturas)--------------------------------------- 
 private ArrayList<Estudiante> ListaEst=new ArrayList<Estudiante>();
 private ArrayList<Asignatura> ListaAsignaturas=new ArrayList<Asignatura>();
 private ArrayList<ConsolidadoNotas> listaNotas=new ArrayList<>();


 public Registros(){}
 
 public void obtenerListaEstudiantes(String nombreArchivo) throws IOException {//metodo con el cual leemos la informacion del archivo Estudiante
			
                                
				arc.abrirArchivo(nombreArchivo, false);//abrimos el archivo y enviamos false para saber el archivo sera leido
				
				
				while(arc.puedeLeer()){//si el metodo puedeLeer retorna verdadero se ejecutara el bucle
					
				    String linea = arc.leerArchivo(); //capturamos una linea de texto leida proveniente del archivo Estudiante
				    
					String[] datos = linea.split(","); //ordenamos la informacion en un arreglo para luego capturarla
                                                                                            
                                                                                           //capturamos con diferentes tipos de datos la informacion del arreglo
					int cons=Integer.parseInt(datos[0]);
                                        
					 int id= Integer.parseInt(datos[1]);
					
					String nombre = datos[2];
					
					String apellido = (datos[3]);
					
					int codigo= Integer.parseInt(datos[4]);
					
                                                                                           
					Estudiante est= new Estudiante(cons,id,nombre, apellido, codigo); //enviamos los datos que capturamos del arreglo al constructor de la clase Estudiante
					ListaEst.add(est);//agregamos un nuevo registro a la lista de Estudiantes
					
				 }
				 arc.cerrarArchivo();
				
			 }
  
 public void obtener_Lista_Asignaturas(String nombreArchivo)throws IOException{//metodo con el cual leemos la informacion del archivo Asignaturas
   
                                        arc.abrirArchivo(nombreArchivo, false);//abrimos el archivo y enviamos false para saber el archivo sera leido
     
                                         while(arc.puedeLeer()){//si el metodo puedeLeer retorna verdadero se ejecutara el bucle 
					
                                        String linea = arc.leerArchivo(); //capturamos una linea de texto leida proveniente del archivo Asignaturas
				      //capturamos con diferentes tipos de datos la informacion del arreglo
					String[] datos = linea.split(","); //ordenamos la informacion en un arreglo para luego capturarla
                                        int cons=Integer.parseInt(datos[0]);
					String codigoprograma= (datos[1]);
                                        int codigoAsignatura = Integer.parseInt(datos[2]);
                                        String asignatura= (datos[3]);
					Asignatura asg=new Asignatura(cons,codigoprograma,codigoAsignatura,asignatura);//enviamos los datos que capturamos del arreglo al constructor de la clase Asignatura
                                        ListaAsignaturas.add(asg);//agregamos un nuevo registro a la lista de Asiganturas
				 }
                                        arc.cerrarArchivo();
 }
 
 public void obtener_Lista_Notas(String nombreArchivo)throws IOException{//metodo con el cual leemos la informacion del archivo Asignaturas
   
                                        arc.abrirArchivo(nombreArchivo, false);//abrimos el archivo y enviamos false para saber el archivo sera leido
     
                                         while(arc.puedeLeer()){//si el metodo puedeLeer retorna verdadero se ejecutara el bucle 
					
                                        String linea = arc.leerArchivo(); //capturamos una linea de texto leida proveniente del archivo Asignaturas
				      //capturamos con diferentes tipos de datos la informacion del arreglo
					String[] datos = linea.split(","); //ordenamos la informacion en un arreglo para luego capturarla
                                        int codest=Integer.parseInt(datos[0]);
					int codasig=Integer.parseInt(datos[1]);
                                        String nomasg=(datos[2]);
                                        float nota1= Float.parseFloat(datos[3]);
                                        float nota2= Float.parseFloat(datos[4]);
                                        float nota3= Float.parseFloat(datos[5]);
                                        String defp1= (datos[6]);
                                        String defp2= (datos[7]);
                                        
                                        ConsolidadoNotas cnts;
                                        cnts=new ConsolidadoNotas(codest, codasig, nomasg, nota1, nota2, nota3, defp1+"."+defp2);
                                        listaNotas.add(cnts);
				 }
                                        arc.cerrarArchivo();
 }
 
 
 
 public ArrayList asignauturas(){
     return ListaAsignaturas;
 }
 public ArrayList ListaEstudiantes(){
     return ListaEst;
 }
 
 public ArrayList obtenerNotas(){
     return listaNotas;
 }
  public int  BuscarcodEst(int numid){
 
       int codEst=0;
       Notas nts=new Notas();
       for (int i=0;i<ListaEst.size();i++){
           if(ListaEst.get(i).getIdentificacion()==numid){
                codEst=ListaEst.get(i).getCodigo();
                   i= ListaEst.size();

   }
   }
         return codEst;
  }
   public int BuscarCodAsig(int pos){
      
      int codAsig=0;
       for(int i=0; i<ListaAsignaturas.size();i++){
           if(ListaAsignaturas.get(i).getconsecutivo()==pos){
                 codAsig=(ListaAsignaturas.get(i).getCodmateria());
                 i=ListaAsignaturas.size();
       }
   
}
               return codAsig;
}
   public String nombreMateria(int pos){
       String nomasg=null;
       for(int i=0; i<ListaAsignaturas.size();i++){
           if(ListaAsignaturas.get(i).getconsecutivo()==pos){
               nomasg=ListaAsignaturas.get(i).getNombreMateria();
               i=ListaAsignaturas.size();
   }

}
        return nomasg;
       
   }
   
   
}
