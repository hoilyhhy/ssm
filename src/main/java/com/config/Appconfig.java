package com.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/*@Configuration
@ComponentScan("com.service")
@MapperScan("com.dao")
@ImportResource("classpath:spring.xml")*/
public class Appconfig {


   /* @Bean("dataSource")
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        driverManagerDataSource.setUrl("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=test");
        driverManagerDataSource.setUsername("sa");
        driverManagerDataSource.setPassword("123456");

        return driverManagerDataSource;
    }*/

   /* @Bean("txManager")
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);

        return  dataSourceTransactionManager;
    }*/
}
