package demo;

import javax.xml.ws.Endpoint;

public class Test {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8093/webservice", new Helloservice());

	}

}
