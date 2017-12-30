package com.canoeworks.equinox.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@EnableAutoConfiguration(exclude={
		DataSourceAutoConfiguration.class,
		MongoAutoConfiguration.class, MongoDataAutoConfiguration.class,
		CassandraDataAutoConfiguration.class,
		CassandraAutoConfiguration.class})
@ComponentScan("com.canoeworks.equinox")
public class EquinoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquinoxApplication.class, args);
	}
}
