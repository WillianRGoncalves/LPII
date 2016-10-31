package aviao;

import enums.Fileira;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Assento{
	Fileira fileira;
	int numero;
	
	public boolean isAssento(Assento assento){
		return (this.fileira.equals(assento.getFileira()) && this.numero == assento.getNumero());
	}
	
	public void imprimirAssento(){
		System.out.println("Assento reservado: " + this.fileira + this.numero);
	}
	
}
