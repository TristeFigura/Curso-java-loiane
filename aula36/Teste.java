package curso.java.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Landing");
		//contato.setTelefone("11 9999-9999");
		
		
		//relacionamento tem um telefone
		Endereco end = new Endereco();
		end.setNomeRua("Rua Sancho Pan�a");
		end.setNumero("n/a");
		end.setComplemento("ao lado da tabacaria");
		end.setCidade("Toboso");
		end.setEstado("Mancha");
		end.setCep("14405-359");
		
		contato.setEndereco(end);
		
		//relacionamento tem um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("11");
		telefone.setNumero("9999-9999");
		
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Casa");
		telefone2.setDdd("11");
		telefone2.setNumero("8888-8888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		//contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		//Teste sa�da no console
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		if (contato != null && contato.getEndereco() != null) {
		System.out.println(contato.getEndereco().getCidade( ));
		}
		
		/* if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}
		*/
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero()); 
			}
			
		}

	}

}
