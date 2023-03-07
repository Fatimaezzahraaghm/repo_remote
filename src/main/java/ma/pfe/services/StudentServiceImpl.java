package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    private final static Logger LOG = LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository repository;
    private StudentMapper mapper;


    public StudentServiceImpl(StudentRepository repository, StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public StudentDto create(StudentDto dto) {
        LOG.debug("Start method create");
        StudentDto result = mapper.convertEntityToDto(repository.create(mapper.convertDtoToEntity(dto)));
        LOG.debug("end method create");
        return  result;
    }

    @Override
    public StudentDto update(StudentDto dto) {
        LOG.debug(("Start method update"));
        StudentDto result = mapper.convertEntityToDto(repository.update(mapper.convertDtoToEntity(dto)));
        LOG.debug("end method update");
        return result;
    }

    @Override
    public boolean delete(long id) {
        LOG.debug(("Start method delete"));
        boolean result = repository.delete(id);
        LOG.debug("end method delete");
        return result;
    }

    @Override
    public List<StudentDto> readAll() {
        LOG.debug(("Start method readAll"));
        List<StudentDto> result = mapper.convertEntitiesToDtos(repository.readAll());
        LOG.debug("end method readAll");
        return result;
    }
}
