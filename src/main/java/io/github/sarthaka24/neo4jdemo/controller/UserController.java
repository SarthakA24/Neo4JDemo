package io.github.sarthaka24.neo4jdemo.controller;

import io.github.sarthaka24.neo4jdemo.domain.User;
import io.github.sarthaka24.neo4jdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return new ResponseEntity<>(this.userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("find/{name}")
    public ResponseEntity<?> findUserByName(@PathVariable("name") String name) {
        return new ResponseEntity<>(this.userService.findByName(name), HttpStatus.OK);
    }

    @GetMapping("find/email/{email}")
    public ResponseEntity<?> findUserByEmail(@PathVariable("email") String email) {
        return new ResponseEntity<>(this.userService.findByEmail(email), HttpStatus.OK);
    }

    @GetMapping("find/mobile/{brandName}")
    public ResponseEntity<?> findUserByMobileBrand(@PathVariable("brandName") String brandName) {
        return new ResponseEntity<>(this.userService.findByMobileBrand(brandName), HttpStatus.OK);
    }
}
