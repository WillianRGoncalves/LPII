import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Telefone {
	String telefone;
	
	public boolean eTelefoneValido(){
		return temDigitosConsecutivos() && eSomaPar() && eIgualExtremos();
	}
	
	private boolean eSomaPar(){
		char [] telefone = this.telefone.toCharArray();
		int soma = 0;
		for(char letra: telefone){
			soma += Integer.parseInt(Character.toString(letra));
		}
		return soma % 2 == 0;
	}
	
	private boolean temDigitosConsecutivos(){
		char [] telefone = this.telefone.toCharArray();
		for(int i = 1; i < telefone.length;i++)
			if(telefone[i] == telefone[i-1]) return false;
		return true;
	}
	
	private boolean eIgualExtremos(){
		return !this.telefone.substring(0, 1).equals(this.telefone.substring(this.telefone.length() - 1));
	}

}
