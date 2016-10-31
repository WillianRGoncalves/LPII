package aviao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reserva implements Comparable<Reserva>{
	Assento assento;
	boolean reservado;
	String pessoa;
	@Override
	public int compareTo(Reserva outro) {
	    return this.pessoa.compareTo(outro.getPessoa());
	  }
	
	public void imprimirReserva(){
		System.out.println("========Reserva===========");
		this.assento.imprimirAssento();
		System.out.println("Pessoa: " + this.pessoa);
	}

}
