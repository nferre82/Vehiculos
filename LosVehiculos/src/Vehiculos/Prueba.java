package Vehiculos;

public class Prueba extends Vehiculo  {

	public Prueba(byte numRuedas) {
		super(numRuedas);
		// TODO Auto-generated constructor stub
	}


	private void ver(Vehiculo v) {
		System.out.println("El vehiculo es de color "+v.getColor());
		System.out.println("hola");
		System.out.println("Adios");
		System.out.println("Tiene "+v.getNumRuedas()+" numero de ruedas");
		System.out.println("Con una cilindrada de"+v.getCilindrada());
		System.out.println("Y una potencia de"+v.getPotencia());
		//System.out.println("Tiene "+v.getnumeroPlazas+" numero de plazas");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo v1=new Vehiculo("verde",(byte) 5,(short) 3.4,(short)1.2);
		Camion c1=new Camion("rojo",(byte) 4,(short) 2.4,(short)9.2);
		v1.ver();
	}

}
