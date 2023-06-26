package colecciones;
//import java.util.Set; //Papa
//import java.util.HashSet; //hijo

public class colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Declarando mi primer arreglo en Java []
		//Primero el tipo de dato que voy a almacenar, le pongo los corchetes cuadrados despues el nombre de mi arreglo y por ultimo instancio mi arreglo. Los datos que voy a guardar en este arreglo. van dentro de {}
		
		String[] listaCompras = new String [] {"leche", "pan", "frutas"};
		
		System.out.println(listaCompras);
		
		//forEach para imprimir cada elemento de mi lista de compras
		
		//para nuestros datos del tipo string, que se almacenan en una variable temporal llamada ProductoTemporal, que se esta llenando de un arreglo llamado listaCompras, vas a imprimir ese productoTemporal
		for(String productoTemporal : listaCompras) {
			System.out.println(productoTemporal);
		}
		
		
		
		
		//Declaro mi arreglo de habitaciones de un hotel
		String[] habitaciones = new String[10];
		
		
		
		//Inicializo o asigno valores a cada indice
		habitaciones[0] = "101";
		habitaciones[1] = "102";
		habitaciones[2] = "103";
		habitaciones[3] = "104";
		habitaciones[4] = "105";
		habitaciones[5] = "106";
		habitaciones[6] = "107";
		habitaciones[7] = "108";
		habitaciones[8] = "109";
		habitaciones[9] = "110";
		
		
		//habitaciones[10] = "111"; Si tratamos de acceder a un elemento mas allá de los elementos declarados al principio, tendremos una excpecion que solo veremos cuando se ejecute el programa
		
		
		
		//Cuando imprimimos un elemento que no esta definido dentro del arreglo, veremos un null. Esto pasa porque para JAVA es preferible tener un elemento nulo a uno indefinido.
		System.out.println(habitaciones[8]);
		
		
		//En caso de querer usar un for each para imprimir los elementos, solo se imprimiran 10 elementos. (solo itera sobre los elementos existentes).
		
		
		
		
		//Instanciando un espacio donde guardar objetos
		//Set<String> cartasDeJuego = new HashSet<>();
		
	}

}


/*

Colecciones


-Arrays
Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuentan con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua sin memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:

-1.- Tamanio fijo.
-2.- Acceso rápido
-3.- Coste elevado para insertar o eliminar elementos.



*/


