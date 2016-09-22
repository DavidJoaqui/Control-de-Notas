
package Archivos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Archivos {
     private BufferedWriter Escritor;
    private BufferedReader Lector;
   
    public void abrirArchivo(String ruta, boolean escritura)throws IOException{
		if(escritura == true){
			this.Escritor= new BufferedWriter(new FileWriter(ruta, true));//si recibimos como parametro la ruta y una variable verdadera entonces el metodo escribira en el archivo
					
		}
		else {
			this.Lector=new BufferedReader(new FileReader(ruta));//sino significa que el archivo sera leido
					
		}
	}
    public void escribirArchivo(String datos) throws IOException{//recibimos los datos que seran escritos en el archivo deseado
		Escritor.write(datos);
		Escritor.newLine();
	}
    public String leerArchivo() throws IOException{//leemos el archivo linea a linea y hacemos su retorno
		return Lector.readLine();
	}
    public void cerrarArchivo() throws IOException{//metodo para cerrar los archivos
		if(Escritor!= null) Escritor.close();
		if(Lector!=null) Lector.close();
	}
		
	public boolean puedeLeer() throws IOException{//retorno de booleano que nos confirma que el archivo se puede leer
		return Lector.ready();
	}
        public int contarLineas(String nombre) throws IOException{//retorna el numero de lineas de texto que tiene el archivo
		
		abrirArchivo(nombre, false);
		int lineas =0;
		while(puedeLeer()){
			leerArchivo();
			lineas++;
		}
		cerrarArchivo();
		return lineas;	
	}


	public String[] LeerDatos(int cantidad){//leemos todo el archivo y lo guardamos en un arreglo de tipo String
		String[] datos = new String[cantidad];
		int i=0;
		try{
			while(this.puedeLeer() && i < cantidad){
				datos[i] = this.leerArchivo();
				i++;
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		return datos;
	}




}

