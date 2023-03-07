package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {
    StudentEntity create(StudentEntity entity);
    StudentEntity update(StudentEntity entity);
    boolean delete(long id);
    List<StudentEntity> readAll();
}
