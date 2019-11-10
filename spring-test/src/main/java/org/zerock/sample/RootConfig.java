  package org.zerock.sample;
  
  import javax.sql.DataSource;
  
  import org.springframework.context.annotation.Bean; import
  org.springframework.context.annotation.ComponentScan; import
  org.springframework.context.annotation.Configuration;
  
  import com.zaxxer.hikari.HikariConfig; import
  com.zaxxer.hikari.HikariDataSource;
  
  @Configuration
  
  @ComponentScan(basePackages = {"org.zerock.sample"}) public class RootConfig
  {
  
  @Bean public DataSource dataSource() { HikariConfig hi = new HikariConfig();
  hi.setDriverClassName("oracle.jdbc.driver.OracleDriver");
  hi.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE"); hi.setUsername("bit");
  hi.setPassword("1234");
  
  HikariDataSource dataSource = new HikariDataSource(hi); return dataSource; }
  
  
  }
 
