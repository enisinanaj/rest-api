package org.sagittarius90;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;
import org.sagittarius90.api.ApplicationConfig;

public class App {

	public static void main(String[] args) {
		ServletHolder servlet = new ServletHolder(new ServletContainer(new ApplicationConfig()));

		Server server = new Server(8080);
		ServletContextHandler context = new ServletContextHandler(server, "/*");
		context.addServlet(servlet, "/*");

		try {
			server.start();
			server.join();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			server.destroy();
		}
	}

}