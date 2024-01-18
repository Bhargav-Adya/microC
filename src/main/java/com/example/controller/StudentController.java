package com.example.controller;

import com.example.model.Student;
import com.example.repositories.StudentRepositoryInterface;
import io.micronaut.http.annotation.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@Controller(value = "/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentRepositoryInterface student;
    @Get("/read")
    public Iterable<Student>read(){
        return student.findAll();
    }
    @Post("/create")
//    @Produces(MediaType.TEXT_PLAIN)
    public Student createWithBody(@Body Student student){
        return this.student.save(student);
    }

    @Post("/update")
    public Student updateWithBody(@Body Student updatedStudent) {
        Optional<Student> studentByRoll = this.student.findById(updatedStudent.getId());
        if (studentByRoll.isPresent()) {
            Student studentEntity = studentByRoll.get();
            studentEntity.setAge(updatedStudent.getAge());
            studentEntity.setName(updatedStudent.getName());
            return this.student.update(studentEntity);
        } else {
            return null;
        }
    }

}
