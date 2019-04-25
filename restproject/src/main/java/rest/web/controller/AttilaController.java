package rest.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.entity.User;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/ja")
@Slf4j
public class AttilaController {

    @GetMapping("")
    public User getUser() {
        log.info("process=get-users");
        return new User("Jakubát Attila", "l4tabar@gmail.com", LocalDateTime.now(), LocalDateTime.now());
    }

}
