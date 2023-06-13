package in.pravakar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pravakar.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
