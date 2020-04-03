package entidade;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@javax.persistence.Entity   // anotação serve para indicar que essa classe é uma entidade.
public class Pessoa implements Serializable{
	
	// Classe representa pessoa.

	private static final long serialVersionUID = 1L;
	
	@Id //idicando quem é o id da classe
	@GeneratedValue(strategy = GenerationType.IDENTITY) // indica que o valor ID será gerado como o identificador da classe
	private Integer id;
	private String nome;
	private String email;
	private String telefone;
	
	public Pessoa(Integer id, String nome, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}
	
	
	
	

}
