package yte.intern.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class RequestParamTest {
    
    @RequestMapping("/courses/{courseNumber}")
    public void print(@PathVariable Long courseNumber,@RequestParam String name , @RequestParam String surname){
        System.out.println("Name: " + name + " Surname: " + surname + " Number: " + courseNumber);
    }
}
