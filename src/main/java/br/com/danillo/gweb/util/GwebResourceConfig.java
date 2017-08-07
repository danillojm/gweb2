package br.com.danillo.gweb.util;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class GwebResourceConfig extends ResourceConfig {

	public GwebResourceConfig() {
		packages("br.com.danillo.gweb.service");
	}

}
