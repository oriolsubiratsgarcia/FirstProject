package com.example.easynotes.properties;


import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConfigurationProperties {

    private DataSourceBuilder dataSourceBuilder;

    @Bean
    public DataSource dataSource() {
        dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/springbootdb?useSSL=false");
        dataSourceBuilder.username("oriol");
        dataSourceBuilder.password("sqlpsswd");
        return dataSourceBuilder.build();
    }

    /*@Value("spring.datasource.password")
    private String valueFromFile;

    public String getValueFromFile(){ return valueFromFile;}*/

}