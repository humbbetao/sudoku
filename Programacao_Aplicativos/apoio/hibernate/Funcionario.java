import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@NamedQuery(name="Funcionario.buscaPorNome", query="select f from Funcionario f where f.nome = :nome")
public class Funcionario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4397123193417934538L;
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable=false)
	private String nome;
	
	@Column
	private float salario;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}
