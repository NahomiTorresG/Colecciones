package colecciones;

public class Cliente {

	//1.- Atributos
	
	public String nombre;
	private String cuentaBancaria;
	private float saldo;
	private String nip;
	
	
	
	//2.- Constructor
	public Cliente(String nombre, String cuentaBancaria, float saldo, String nip) {
		this.nombre = nombre;
		this.cuentaBancaria = cuentaBancaria;
		this.saldo = saldo;
		this.nip = nip;
	}//cierre constructor
	
	
	
	//3.- Metodos
	public void mostrarInfoCliente() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("La cuenta bancaria es: " + cuentaBancaria);
		System.out.println("El saldo es: " + saldo);
		System.out.println("El nip es: " + nip);
	}//cierre metodo



	//Getters y setters
	public float getSaldo() {
		return saldo;
	}

	//
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	
/*
	Encapsulamiento (1 de los 4 pilares de la POO)
	
	Tiene que ver con la forma en como ocultamos algunos detalles de nuestra clase (atributos y metodos).
	La gran ventaja de hacer esto es que podemos proteger los datos y el comportamiento de una clase. Cuando utilizamos los modificadores de acceso, podemos controlar la forma en como se accede a los datos y como interactuamos con ellos.
	
	Modificadores de acceso
	
	-public
	-private
	-protected
	-default (sin modificador de acceso
	
	Con esto buscamos evitar:
	
		-Reasignacion de valores
	float cuenta = 157,478.75f;
	cuenta = 0.00f;
	
	
	
	Cuando declaramos nuestros atributos como privados, se impide el acceso a esta informacion (no podremos imprimirla en consola, ni mucho menos modificarla).
	
	
	Jesus.nombre = si puedo acceder porque la informacion es publica
	Jesus.saldo = no se muestra porque la informacion esta privada
	
	
	Para solventar esto, usamos los getters y setters. El getter nos permite acceder al dato por medio de un metodo publico llamado get, y tmabien podemos modificar la informacion por medio del set (metodo publico)
	
	
	Jesus.getcuentaBancaria = si puedo acceder a la informacion
	Jesus.setCuentaBancaria = si puedo modificar la informacion
	
	
	Ventajas del encapsulamiento
	
	-Proteccion de datos: cuando dejamos los datos en privado, se evita que se sobreescriban, que se accedan directamente a ellos y se modifiquen de manera incontrolada.
	
	-Control de acceso: Podemos usar validaciones o valores booleanos para tener acceso o no a la informacion (que un administrador pueda usar un setter para modificar algun dato en especifico).
	
	-Flexibilidad y mantenimiento: Podremos cambiar la implementacion interna de nuestras clases (modificar el acceso etc.), sin modificar el codigo externo que la utiliza (herencia, etc.).
	
	
	-Abstracción: El encapusulamiento nos permite ocultar los detalles internos de una clase, y nos proporciona un enfoque "mas limpio" sobre lo que hace una clase, mas no como lo hace. 
	
	
	
	*/
}
