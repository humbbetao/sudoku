import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)  
public class Gerente extends Funcionario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2943570536582921827L;
	
	//@PrimaryKeyJoinColumn(name="id", referencedColumnName="id")
	
	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.)
	private Funcionario funcionario;
	
	@Column(name="nome_dep")
	private String nomeDep;
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getNomeDep() {
		return nomeDep;
	}
	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
