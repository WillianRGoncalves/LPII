package aviao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import enums.Fileira;
import lombok.Getter;

@Getter
public class Aviao {
	List<Reserva> reservas = new ArrayList<>();
	
	
	public Aviao(){
		for(Fileira fileira: Fileira.values())
			for(int i = 1; i<=31; i++)
				reservas.add(new Reserva(new Assento(fileira, i), false, null));	
	}
	
	public boolean reservarAssento(String assento, String pessoa){
		assento = assento.toUpperCase();
		Assento a = new Assento(Fileira.valueOf(assento.substring(0, 1)), Integer.parseInt(assento.substring(1)));
		for(Reserva b: reservas)
			if (b.getAssento().isAssento(a) && !b.reservado){
				b.setReservado(true);
				b.setPessoa(pessoa);
				return true;
			}
		return false;
	}
	
	public boolean cancelarReserva(String assento){
		assento = assento.toUpperCase();
		Assento a = new Assento(Fileira.valueOf(assento.substring(0, 1)), Integer.parseInt(assento.substring(1)));
		for(Reserva b: reservas)
			if (b.getAssento().isAssento(a) && b.reservado){
				b.setReservado(false);
				b.setPessoa(null);
				return true;
			}
		return false;
	}
	
	public void imprimirAssentosReservados(){
		for(Reserva reserva:reservas)
			if(reserva.reservado) reserva.getAssento().imprimirAssento();
		
	}
	
	public void imprimirAssentosReservadosOrdenado(){
		List<Reserva> reservados = new ArrayList<>();
		for(Reserva reserva:reservas)
			if(reserva.reservado) reservados.add(reserva);
		reservados.sort(null);
		for(Reserva reserva:reservados)
			reserva.imprimirReserva();
		
	}
	
	public void imprimirDadosReserva(String assento){
		assento = assento.toUpperCase();
		Assento a = new Assento(Fileira.valueOf(assento.substring(0, 1)), Integer.parseInt(assento.substring(1)));
		for(Reserva b: reservas)
			if (b.getAssento().isAssento(a)){
				b.imprimirReserva();
			}
	}
	
	
	
}
