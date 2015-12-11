import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class Conexao {

	private Connection con;
	private EntityManager em;
	
	public Conexao() {
		//criando uma conexão com o hibernate mapeado no arquivo persistence.xml
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("aulaJava");
		em = factory.createEntityManager();
		
		//criando os objetos
		Funcionario f = new Funcionario();
		Gerente g = new Gerente();
		
		f.setNome("Max 1");
		f.setSalario(100f);
		
		
		//novo gerente
		g.setNomeDep("Dacom");
		g.setNome("Max");
		g.setSalario(2.0f);
		
		//g.setFuncionario(f);
		
		//persistindo
		/*em.getTransaction().begin();
		em.persist(g);
		em.getTransaction().commit();*/
		
		//List<Funcionario> lf = buscaPorNome("Max");
		List<Funcionario> lf = buscaPorNomeH("Max");
		for(Funcionario f1: lf){
			System.out.println("nome: " + f1.getNome() );
		}
		
		
		/*f = em.find(Funcionario.class, 12);
		f.setNome("max 2");
		
		em.persist(f);*/
		
		em.close();
		factory.close();
		
		//System.out.println("funcionario " + f.getNome());
	}
	
	public List<Funcionario> buscaPorNome(String nome){
		String query = "select f from From Funcionario f where f.nome like :nome";
		
		this.em.createQuery(query).setParameter("nome", nome).getResultList();
		
		return this.em.createNamedQuery("Funcionario.buscaPorNome", Funcionario.class).setParameter("nome", nome).getResultList();
	}
	
	public List<Funcionario> buscaPorNomeH(String nome){
		Session session = (Session) em.getDelegate();
		
		Criteria c = session.createCriteria(Funcionario.class);
		
		c.add(Restrictions.ilike("nome", nome));
		
		
		return c.list();
	}
	
	
	public boolean insereFunc(String nome, Float salario){
		try{
			if( con == null || con.isClosed() ){
				throw new Exception("Inicialização da conexão é requerida primeiro!");
			}
			
			Statement statement = con.createStatement();
			String sql = "INSERT INTO funcionario (nome, salario) VALUES ('"+nome+"',"+salario.floatValue()+")";
			
			statement.execute(sql);
			
			System.out.println("Executando consulta: "+sql);
			System.out.println("ready");
			
			return true;
		}
		catch(Exception ex){
			
			System.out.println("ihh falhou!: " + ex.getMessage());
			
			return false;
		}
	}
	
	public static void main(String args[]){
		new Conexao();
	}
}
