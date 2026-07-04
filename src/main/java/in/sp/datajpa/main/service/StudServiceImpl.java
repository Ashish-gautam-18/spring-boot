package in.sp.datajpa.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.datajpa.main.repository.StudentRepository;
import in.sp.datajpa.main.std.Student;

@Service
public class StudServiceImpl implements StudentService {
    
	@Autowired
	private StudentRepository repo;
	
	@Override
	public boolean addStudentDetails(Student std) {
	 boolean status;
		try {
			repo.save(std);
			status = true;
		}catch(Exception e) {
			e.printStackTrace();
			status = false;
		}
		return status;
	}


	@Override
	public List<Student> getAllStdDetail() {
		
		return repo.findAll();
	}

	
	
	@Override
	public Student getStdDetailById(long sid) {
		Optional<Student> opt = repo.findById(sid);
		//if (opt.isPresent()) {
			return opt.get();
		//}
		//return null;
	}


	@Override
	public boolean deleteStdDetails(long sid) {
		boolean status;
		try {
			repo.deleteById(sid);
			status=true;
		}
		catch(Exception e) {
			e.printStackTrace();
			status= false;
		}
		return status;
	}


	@Override
	public boolean updateStdDetail(long sid, double marks) {
		Student std = getStdDetailById(sid);
		              // getstdDetailByID  take above method
		if (std!=null) {
			std.setMarks(marks);
			repo.save(std);
			return true;
		}
		return false;
	}

}
