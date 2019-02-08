//package kr.ac.kopo.ctc.spring.board.dao;
//
//import javax.persistence.EntityManagerFactory;
//
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
//
//@EnableAutoConfiguration
//public class DaoConfig {
//	
//	@Bean
//	public HibernateJpaSessionFactoryBean sessionFactory(EntityManagerFactory emf) {
//	    HibernateJpaSessionFactoryBean fact = new HibernateJpaSessionFactoryBean();
//	    fact.setEntityManagerFactory(emf);
//	    return fact;
//	}
//	
////	@Autowired
////	private EntityManagerFactory entityManagerFactory;
////
////	@Bean
////	public SessionFactory getSessionFactory() {
////	    if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
////	        throw new NullPointerException("factory is not a hibernate factory");
////	    }
////	    return entityManagerFactory.unwrap(SessionFactory.class);
////	}
//	
////	@Bean(name = "entityManagerFactory")
////	public EntityManagerFactory entityManagerFactory() {
////		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
////		emf.setDataSource(dataSource);
////		emf.setJpaVendorAdapter(jpaVendorAdapter);
////		emf.setPackagesToScan("com.mysource.model");
////		emf.setPersistenceUnitName("default");
////		emf.afterPropertiesSet();
////		return emf.getObject();
////	}
//	
//}
