package servletcontextlistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Notes implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("hs initalized oluþtu");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("hs destroy silindi");
		
	}

}
