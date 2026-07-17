package in.sp.datajpa.main.service;

import java.util.List;

import in.sp.datajpa.main.std.Student;

public interface StudentService {
	
	public boolean addStudentDetails(Student std);
	
	public List<Student> getAllStdDetail();
	
	public Student getStdDetailById(long sid);
	
	public boolean updateStdDetail(long sid , double marks);
	
	public boolean deleteStdDetails (long sid);

}
