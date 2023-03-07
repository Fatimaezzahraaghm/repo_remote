package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    StudentEntity student = new StudentEntity();
    private final static Logger LOG= LoggerFactory.getLogger(StudentRepositoryImpl.class);
    @Override
    public StudentEntity create(StudentEntity e) {
        student.setId(e.getId());
        student.setName(e.getName());
        return student;
    }

    @Override
    public StudentEntity update(StudentEntity e) {
        student.setId(e.getId());
        student.setName(e.getName());
        return student;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<StudentEntity> readAll() {
        return new ArrayList<>();
    }
}
