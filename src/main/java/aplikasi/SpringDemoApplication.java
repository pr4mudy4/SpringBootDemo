package aplikasi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.setha.SpringDemo.InjeksiViaConstructor;
import com.setha.SpringDemo.InjeksiViaSetter;

@SpringBootApplication
@ComponentScan("com.setha.SpringDemo")
public class SpringDemoApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringDemoApplication.class, args);
	
	InjeksiViaConstructor injeksiViaConstructor =(InjeksiViaConstructor) context.getBean("injeksiViaConstructor");
	injeksiViaConstructor.getMessage();
	
	InjeksiViaSetter injeksiViaSetter = (InjeksiViaSetter) context.getBean("injeksiViaSetter");
	injeksiViaSetter.getMessage();
	}
}
