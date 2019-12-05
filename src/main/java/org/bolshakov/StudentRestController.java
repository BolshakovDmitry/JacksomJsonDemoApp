package org.bolshakov;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    // reach the endpoint of stidents
private List<Student> theStudents;

@PostConstruct
public void loadData(){
    theStudents = new ArrayList<>();
    theStudents.add(new Student("Dima","Bolshakov"));
    theStudents.add(new Student("Misha","Naletov"));
    theStudents.add(new Student("Slava","Gerasimov"));

}

    @GetMapping("/students")
    public List<Student> getStudents(){

        return theStudents;
    }

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId){
    // check the student id in the list size
        if((studentId>=theStudents.size() || (studentId<0))){
            throw new StudentNotFoundExcrption("Student is not found " + studentId);
        }

    return theStudents.get(studentId);
    }

    // add an exception handler
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundExcrption exc) {
    // create a StundentErrorResponse
    StudentErrorResponse error =new StudentErrorResponse();
    error.setStatus(HttpStatus.NOT_FOUND.value());
    error.setMessage(exc.getMessage());
    error.setTimeStamp(System.currentTimeMillis());
    // return response Entity
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }

}
