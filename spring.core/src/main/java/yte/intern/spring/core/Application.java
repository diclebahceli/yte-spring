package yte.intern.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		ComponentTest bean = context.getBean(ComponentTest.class);
		// bean.print();

		// DependencyTestInjection dependencyTestInjection = context.getBean(DependencyTestInjection.class);
		// dependencyTestInjection.print();	


		// Video6 video6Bean = context.getBean(Video6.class);
		// video6Bean.print();
	
		InjectionTest injectionTest = context.getBean(InjectionTest.class);
		injectionTest.print();
	}

}
