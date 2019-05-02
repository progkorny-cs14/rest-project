package rest.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.entity.User;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/szi")
@Slf4j
public class SzaboImreController {

    @GetMapping("")
    public User getUser() {



        System.out.println("lmao");
        log.info("process=get-users");
        return new User("Szabó Imre", "96.sz.imre@gmail.com", LocalDateTime.now(), LocalDateTime.now());
    }

}
