package DemoSpringBoot03.demospringboot.controller;


import DemoSpringBoot03.demospringboot.payload.request.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")

public class HelloController {
    @GetMapping("")
    public String hello(@RequestParam String hoten, @RequestParam int tuoi){
        return "Hello Spring boot " + hoten + " " + tuoi;
    }

    @PostMapping("/hoagiang")
    public String hoagiang(@RequestBody LoginRequest loginRequest){
        return "Hello Spring Hoagiang" + loginRequest.getUsername() + loginRequest.getPassword();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable int id){
        return new ResponseEntity<>("Update " + id, HttpStatus.OK);
    }
}
