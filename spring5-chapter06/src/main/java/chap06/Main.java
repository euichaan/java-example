package chap06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppCtx.class);
		final Client2 client2 = ctx.getBean(Client2.class);
		client2.send();
		ctx.close();
	}
}
