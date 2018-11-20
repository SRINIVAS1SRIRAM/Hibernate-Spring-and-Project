

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Student;

public class AnnotationSpringImpl {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com");
		context.refresh();
		
		Student student = (Student) context.getBean("student");
		
		student.setStudentId(01);
		student.setStudentName("Alex");
		student.setStudentPercentage(90);
		
		System.out.println("Student ID: " + student.getStudentId());
		System.out.println("Student Name: " + student.getStudentName());
		System.out.println("Student Percentage: " + student.getStudentPercentage());
		

	}

}
