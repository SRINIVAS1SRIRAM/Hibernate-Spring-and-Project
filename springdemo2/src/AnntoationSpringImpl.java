import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Employee;

public class AnntoationSpringImpl 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com");
		
		context.refresh();
	
		Employee employee=(Employee)context.getBean("employee");
		
		employee.setEmpId("S1001");
		employee.setEmpName("Sudhir");
		employee.setSalary(67000);
		
		System.out.println("Employee ID:"+employee.getEmpId());
		System.out.println("Employee Name:"+employee.getEmpName());
		System.out.println("Employee Salary:"+employee.getSalary());
	}
}