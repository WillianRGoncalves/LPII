package teste;

import aviao.Assento;
import aviao.Aviao;
import enums.Fileira;

public class Main {

	public static void main(String[] args) {
		Aviao aviao = new Aviao();
		System.out.println("==========Reservas de Assentos=====================");
		aviao.reservarAssento("a31", "Willian");
		System.out.println(aviao.reservarAssento("a31", "Cecília"));
		aviao.imprimirAssentosReservadosOrdenado();
		
		System.out.println("==========Cancelar Reservas=====================");
		System.out.println(aviao.cancelarReserva("a31"));
		aviao.imprimirAssentosReservadosOrdenado();
		System.out.println(aviao.cancelarReserva("a31"));
		
		
		System.out.println("==========Assentos Reservados=====================");
		aviao.reservarAssento("a1", "Willian");
		aviao.reservarAssento("a2", "Cecília");
		aviao.reservarAssento("a3", "Lucas");
		aviao.imprimirAssentosReservados();
		aviao.imprimirAssentosReservadosOrdenado();
		aviao.imprimirDadosReserva("a1");

	}

}
