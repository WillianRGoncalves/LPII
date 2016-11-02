import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arquivo = "entrada";
		StringBuilder entrada = new StringBuilder();
		String [] telefones;
		List<Telefone> todosTelefones = new ArrayList<>();
		Validos validos;
		//Leitura de Arquivo
		try {
		      FileReader arq = new FileReader(arquivo);
		      BufferedReader lerArq = new BufferedReader(arq);
		 
		      String linha = lerArq.readLine();
		      while (linha != null) {
		    	  entrada.append(linha).append(" ");
		    	  linha = lerArq.readLine();
		      }
		 
		      arq.close();
		    } catch (IOException e) {
		        System.err.printf("Erro na abertura do arquivo: %s.\n",
		          e.getMessage());
		    }
		//Transformando todos telefones em lista
		 telefones = entrada.toString().split(" ");
		 for(String telefone:telefones)
			 todosTelefones.add(new Telefone(telefone));
		 //Verificando os telefones válidos
		 validos = new Validos(todosTelefones);
		 //Criação de Arquivo
		 FileWriter arq;
		try {
			arq = new FileWriter("validos.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			 for (Telefone telefone: validos.getValidos()) {
				 gravarArq.printf(telefone.getTelefone() + "\n");
			 }
			 gravarArq.printf(todosTelefones.size() + "|" + validos.getValidos().size());

			 arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n",
			          e.getMessage());
		}
		 
	}
	

}