package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class StudentMapper {
    public StudentDto convertEntityToDto (StudentEntity entity) {
        StudentDto dto= new StudentDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }
    public StudentEntity convertDtoToEntity(StudentDto dto){
        StudentEntity entity= new StudentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
    public List<StudentEntity> convertDtosToEntities (List<StudentDto> l){
        return l.stream()
                .map(dto -> convertDtoToEntity(dto))
                .collect(Collectors.toList());
    }

    public List<StudentDto> convertEntitiesToDtos(List<StudentEntity> l){
        return l.stream()
                .map(entity -> convertEntityToDto(entity))
                .collect(Collectors.toList());
    }
}
