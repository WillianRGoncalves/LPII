import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
@Getter
public class Validos {
	List<Telefone> validos = new ArrayList<>();
	
	public Validos(List<Telefone> telefones){
		for(Telefone telefone: telefones)
			if(telefone.eTelefoneValido()) validos.add(telefone);
	}
}
