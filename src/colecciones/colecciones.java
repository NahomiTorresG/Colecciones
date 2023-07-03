package colecciones;
//import java.util.Set; //Papa
//import java.util.HashSet; //hijo

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;


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
		
		
		for(String habitacionTemporal : habitaciones) {
			System.out.println(habitacionTemporal);
		}//for
		
		//Instanciando un espacio donde guardar objetos
		//Set<String> cartasDeJuego = new HashSet<>();
		
		
		
		//ArrayList para una lista de contacto
		
		//Uso la interface List que almacena contactos (objeto), se llama listaDeContactos e instancia un arrayList para manejar los mismos tipos de datos (cliente)
		List<Cliente> listaDeClientes = new ArrayList<>();
		
		//Primero instancio un objeto de la clase cliente (nombre, cuenta, saldo, nip)
		Cliente Felipe = new Cliente("Felipe Maqueda", "ABC123", 156.50f, "1234");
		
		//Agrego el cliente a mi lista de clientes con el metodo .add
		listaDeClientes.add(Felipe);
		
		
		listaDeClientes.add(new Cliente("Naruto", "XXX123", 100.00f, "0000"));
		
		
		//Imprimo la informacion de la lista (utilizar metodos)
		System.out.println("Lista Completa");
		System.out.println(listaDeClientes);
		
		
		//Sacar un elemento de la lista y asignarlo a una variable
		System.out.println("Elemento en el indice 0");
		Cliente datoDeLaLista = listaDeClientes.get(0);
		
		//Imprimir el elemento de la lista
		System.out.println("Impresion de un elemento de la lista");
		System.out.println(datoDeLaLista.getSaldo());
		
		
		//Eliminar elementos de la lista
		listaDeClientes.remove(0);
		
		
		//Imprimo la info de mi lista
		System.out.println(listaDeClientes);
		
		
		
		
		
		//Conjunto para servicios de un hotel
		
		Set<String> roomService = new HashSet<>();
		
		//Agregamos elementos a nuestro HashSet
		roomService.add("chilaquiles");
		roomService.add("Agua mineral");
		roomService.add("Wi-Fi");
		
		
		//Hotel con promocion (si pideron agua mineral aplicamos un descuento del 50%)
		if (roomService.contains("Agua mineral")) {
			System.out.println("Obtienes un decuento del 50%");
		}//if
		
		
		
		//Borramos toda la lista de roomService
		System.out.println("**Borrando la info de roomService**");
		roomService.clear();
		System.out.println(roomService);
		
		
		
		//HashMap para mi sistema de reservas del hotel
		Map<String, Cliente> reservaHabitacion = new HashMap<>();
		
		reservaHabitacion.put("101", new Cliente("Jesus", "135JJJ", 1890.87f, "0011"));
		reservaHabitacion.put("101", new Cliente("Bad Bunny", "257bbJ", 2980.87f, "1111"));
		
		
		//Impresion de una reserva
		Cliente reservaBadBunny = reservaHabitacion.get("102");//obtener un dato del hashmap
		System.out.println(reservaHabitacion);
		
		
		
		
	}//main

}//colecciones


/*

Colecciones


-Arrays
Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuentan con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua sin memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:

-1.- Tamanio fijo.
-2.- Acceso rápido
-3.- Coste elevado para insertar o eliminar elementos.



-ArrayList

Es una implementacion de una coleccion llamada list (interface superior), y se utiliza mucho para almacenar elementos de una forma dinamica. Las principales caracteristicas de un ArrayList son:

	1.- Tamaño dinamico
	2.- Acceso rapido
	3.- Coste elevado para insertar o eliminar elementos



-Set
Es una estructura de datos que almacena elementos unicos sin orden especifico. Las principales caracteristicas de un set son:

	1.- No hay elementos duplicados
	2.- No hay orden especifico
	3.- La busqueda es más rápida (key-value)



-HashMap
Es una implementacion de la interfaz Map de Java que permite que la informacion se almacene en pares clave-valor. Sus principales caracteristicas son:

	1.-Almacenamiento K y V
	2.-sin orden especifico
	3.-Busqueda rápida
	4.-Iteracion rápida (for each)
	5.-No sincronizado


*/


