package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.services.StudentService;
import ma.pfe.services.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final static Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);
    private StudentService service;
public StudentController(StudentService service) {

    this.service = service;
    }
@PostMapping
    public StudentDto create(@RequestBody StudentDto dto) {
    LOG.debug("Start create");
    StudentDto result = service.create(dto);
    LOG.debug("end methode create");
    return result;
    }

@PutMapping
    public StudentDto update(@RequestBody StudentDto dto) {
    LOG.debug("Start update");
    StudentDto result = service.update(dto);
    LOG.debug("end update s");
    return result;
    }

@DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id) {
    LOG.debug(("Start delete "));
    boolean result = service.delete(id);
    LOG.debug("end delete");
    return result;
    }

@GetMapping
    public List<StudentDto> readAll() {

    LOG.debug(("Start methode name"));
    List<StudentDto> result = service.readAll();
    LOG.debug("end methode name");
    return result;
    }
}

