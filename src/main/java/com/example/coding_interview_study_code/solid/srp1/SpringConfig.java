package com.example.coding_interview_study_code.solid.srp1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MySQLDataSource mySQLDataSource() {

        return new MySQLDataSource();
    }

    @Bean
    public OracleDataSource oracleDataSource() {

        return new OracleDataSource();
    }
}
