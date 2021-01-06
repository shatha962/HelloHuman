package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String human(@RequestParam(value = "fname", required = false) String fname, @RequestParam(value = "lname", required = false) String lname) {

        if (fname != null && lname == null) {
            return "<h1>Hello " + fname + "</h1>" + "\n" + "<h3>Welcome to spring boot</h3>";
        }
        if (fname != null && lname != null) {
            return "<h1>Hello " + fname +" " +lname+ "</h1>" + "\n" + "<h3>Welcome to spring boot</h3>";
        }
        else {
            return "<h1>Hello HUMAN!</h1>" + "<h3>Welcome to spring boot</h3>";
        }

    }
}
