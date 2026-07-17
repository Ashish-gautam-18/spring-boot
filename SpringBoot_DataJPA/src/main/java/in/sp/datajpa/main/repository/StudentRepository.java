package in.sp.datajpa.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.datajpa.main.std.Student;

public interface StudentRepository extends JpaRepository<Student,Long > {

}
