package org.example.controler;

import org.example.Model.StudentDetails;
import org.example.services.ConduiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/StudentData")
public class ConduiraController {

    private ConduiraService conduiraService;
 @Autowired
    public ConduiraController(ConduiraService conduiraService)
 {
     this.conduiraService = conduiraService;
 }
@PostMapping(produces = "application/json",value = "/addstudentDetails")
 public ResponseEntity<String> AddStudentDetails(@RequestBody StudentDetails studentDetails)
{
    return ResponseEntity.ok(conduiraService.addStudentData(studentDetails));
 }

    @GetMapping(value = "/getstudentDetails")
    public ResponseEntity<String> getStudentDetails ()
    {
        return ResponseEntity.ok(conduiraService.getStudetData());
    }

}