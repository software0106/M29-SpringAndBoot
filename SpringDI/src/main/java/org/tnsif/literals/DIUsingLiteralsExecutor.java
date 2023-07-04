package org.tnsif.literals;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*Program to demonstrate on DI in the form of literals*/
public class DIUsingLiteralsExecutor {
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("literals.xml");
		Employee e=(Employee) a.getBean("e1");
		e.print();
	}


}
