package com.canoeworks.equinox.cassandra;

import org.springframework.stereotype.Component;

@Component
public class CassandraDataStoreImpl {
	
	CassandraConfig config;
	
	public String getUser() {
		config = new CassandraConfig();
		String node = "127.0.0.1";
	    int port = 9042;
	    try {
	    		config.connect(node, port);
	    } catch(Exception e) {
	    		System.out.println(e);
	    }
		return "Found It";
	}

}
