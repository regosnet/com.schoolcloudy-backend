package com.schoolcloudy.web.configuration;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.schoolcloudy.repository")
@ComponentScan("com.schoolcloudy")
public class BusinessConfiguration {

	@Bean
	@Profile("prod")
	public JpaVendorAdapter jpaVendorAdapter(){
		HibernateJpaVendorAdapter jpaAdapter = new HibernateJpaVendorAdapter();
		jpaAdapter.setShowSql(true);
		jpaAdapter.setGenerateDdl(true);
		jpaAdapter.setDatabase(Database.MYSQL);
		jpaAdapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
		return jpaAdapter;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
		Properties props = new Properties();
		props.setProperty("hibernate.format.sql", String.valueOf(true));
		//props.put("hibernate.hbm2ddl.auto", "create-drop");
		//props.put("hibernate.hbm2ddl.import_files", "data.sql");
		
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource);
		emf.setPackagesToScan("com.schoolcloudy.model");
		emf.setJpaVendorAdapter(jpaVendorAdapter);
		emf.setJpaProperties(props);
		return emf;
	}
	
	@Bean(name="transactionManager")
	@Profile("prod")
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		return new JpaTransactionManager(emf);
	}

	
	@Bean 
	@Profile("prod")
	public BeanPostProcessor persistenceTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}
	
	@Bean
	@Profile("test")
	public JpaVendorAdapter jpaVendorAdapterForTest(){
		HibernateJpaVendorAdapter jpaAdapter = new HibernateJpaVendorAdapter();
		jpaAdapter.setShowSql(true);
		jpaAdapter.setGenerateDdl(true);
		jpaAdapter.setDatabase(Database.H2);
		jpaAdapter.setDatabasePlatform("org.hibernate.dialect.H2Dialect");
		return jpaAdapter;
	}
	
	@Bean(name="transactionManager")
	@Profile("test")
	public PlatformTransactionManager transactionManagerForTest(EntityManagerFactory emf) {
		JpaTransactionManager jpaManager = new JpaTransactionManager();
		jpaManager.setEntityManagerFactory(emf);
		return jpaManager;
	}
	@Bean
	@Profile("test")
	public BeanPostProcessor persistenceTranslationForTest() {
		return new PersistenceExceptionTranslationPostProcessor();
	}
}
