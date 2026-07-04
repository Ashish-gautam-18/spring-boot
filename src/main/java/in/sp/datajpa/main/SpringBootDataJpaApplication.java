package in.sp.datajpa.main;

import java.applet.AppletContext;
import java.util.List;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.datajpa.main.service.StudServiceImpl;
import in.sp.datajpa.main.service.StudentService;
import in.sp.datajpa.main.std.Student;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(SpringBootDataJpaApplication.class, args);
	
	StudentService stdService = ctx.getBean(StudServiceImpl.class);
	
	Student std = new Student();
	
	std.setName("babu");
	std.setRollno(25);
	std.setMarks(99.01);
	
	
	
//  boolean status=stdService.addStudentDetails(std);
//	  
//       if(status) {
//    	   System.out.println("insertion seccessfull..");
//       }else {
//    	   System.out.println("somthing is wrong by developer..");
//       }
		  

//	List<Student> ls = stdService.getAllStdDetail();
//	for(Student s : ls) {
//		System.out.println("Id : " +s.getSid());
//		System.out.println("Name : " +s.getName());
//		System.out.println("Rollno : " +s.getRollno());
//		System.out.println("Marks : " +s.getMarks());
//	}
//	
	
	
	
	
	
	
//	
//      	Student s = stdService.getStdDetailById(1L);
//    // if(s!=null)
//     {
//    		  System.out.println("Id : " +s.getSid());
//    		  System.out.println("Name : " +s.getName());
//    		  System.out.println("Rollno : " +s.getRollno());
//    		  System.out.println("Marks : " +s.getMarks());
////      	}
////      else {
////         System.out.println("user not found"); 		
////      	}
//         

	
	
	
	
	
	boolean s = stdService.updateStdDetail(3L, 77.77);
	if(s) {
		System.out.println(" Updation Success... ");
	}else {
		System.out.println(" Something is wrong...");
	}
	
	
	
	
	
	
	
//	boolean s = stdService.deleteStdDetails(4L);
//	if(s) {
//		System.out.println(" Updation Success... ");
//	}else {
//		System.out.println(" Something is wrong...");
//	}
//
	
	
  }
}









