package rest.web.controller;

import rest.entity.User;
import rest.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api")
@Slf4j
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        log.info("process=get-users");
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        log.info("process=get-user, user_id={}", id);
        Optional<User> user = userService.getUserById(id);
        return user.map( u -> ResponseEntity.ok(u))
                   .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/users")
    @ResponseStatus(CREATED)
    public User createUser(@RequestBody User user) {
        log.info("process=create-user, user_email={}", user.getEmail());
        return userService.createUser(user);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        log.info("process=update-user, user_id={}", id);
        user.setId(id);
        return userService.updateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        log.info("process=delete-user, user_id={}", id);
        userService.deleteUser(id);
    }

    @GetMapping("/szm")
    public User getUser() {
        log.info("process=get-users");
        return new User("Szabó Máté", "szabo.mate@inf.unideb.hu", LocalDateTime.now(), LocalDateTime.now());
    }

    @GetMapping("/kf")
    public User getKornel() {
        log.info("process=get-users");
        return new User("Filep Kornel", "kornel.filep@gmail.com", LocalDateTime.now(), LocalDateTime.now());
    }



    @GetMapping("/oa")
    public User getUserOa() {
>>>>>>> oa
        log.info("process=get-users");
        return new User("Olaru Alexandra", "olaru.alexa@hotmail.com", LocalDateTime.now(), LocalDateTime.now());
    }



    @GetMapping("/st")
    public User getSass() {
        log.info("process=get-users");
        return new User("Sass Tamás", "sasstomi98@gmail.com", LocalDateTime.now(), LocalDateTime.now());
    }

    @GetMapping("/ja")
    public User getJakubatAttila() {
        log.info("process=get-users");
        return new User("Jakubát Attila", "l4tabar@gmail.com", LocalDateTime.now(), LocalDateTime.now());
    }

    @GetMapping("/cza")
    public User getCzeglediAttila() {
        log.info("process=get-users");
        return new User("Czegledi Attila", "czegiati@gmail.com", LocalDateTime.now(), LocalDateTime.now());
    }

>>>>>>> oa
    @GetMapping("/print")
    public String print(){
        System.out.println("Szabó Máté 12:44");
        System.out.println("Szabó Máté 12:46");
        System.out.println("Szabó Máté 12:48 sdfghjkl");
        System.out.println("Szabó Máté 12:48 asd");

        System.out.println("Trololo");
>>>>>>> 76260e1fc870649ac5eb52599697131f151730ef
        System.out.println("Szabó Máté");
        System.out.println("Szabó Máté, Filep Kornel");
        System.out.println("Szabó Máté 12:55");
        System.out.println("Jeszy a legjobb");
        System.out.println("De komolyan");
        System.out.println("Hello darkness my old friend");
        return "Szabó Máté, Filep Kornel, Sass Tamás";

    }

}
