package guimaraes.joao.exemploescopo;

import guimaraes.joao.exemploescopo.DAO.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploescopoApplication.class, args);

//		Dessa forma o objetoDAO1 e objetoDAO2 serão a mesma instancia, isso devido ao faro que o  Spring control
//		os componentes com o pattern Singleton.
//
//		Para que isso aconteça, devemos utilizar nas classes:
//		@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

		ClassDAO objetoDAO1 = applicationContext.getBean(ClassDAO.class);
		ClassDAO objetoDAO2 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " + objetoDAO1);
		System.out.println("Objeto JDBC: " + objetoDAO1.getObjetoJDBC());

		System.out.println("Objeto DAO: " + objetoDAO2);
		System.out.println("Objeto JDBC: " + objetoDAO2.getObjetoJDBC());
	}

}
