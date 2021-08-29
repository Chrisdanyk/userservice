package io.getarrays.userservice;

import io.getarrays.userservice.domain.Role;
import io.getarrays.userservice.domain.User;
import io.getarrays.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserserviceApplication.class, args);
    }

    //    @Bean
//    CommandLineRunner run(UserService userService) {
//        return args -> {
//            userService.saveRole(new Role(null, "ROLE_USER"));
//            userService.saveRole(new Role(null, "ROLE_MANAGER"));
//            userService.saveRole(new Role(null, "ROLE_ADMIN"));
//            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//            userService.saveUser(new User(null, "John Travolta", "john", "1234", new ArrayList<>()));
//            userService.saveUser(new User(null, "Michael Jordan", "jordan", "1234", new ArrayList<>()));
//            userService.saveUser(new User(null, "Will smith", "will", "1234", new ArrayList<>()));
//            userService.saveUser(new User(null, "Cena Travis", "cena", "1234", new ArrayList<>()));
//            userService.saveUser(new User(null, "Rambo Silveter", "rambo", "1234", new ArrayList<>()));
//
//            userService.addRoleToUser("jordan", "ROLE_USER");
//            userService.addRoleToUser("john", "ROLE_MANAGER");
//            userService.addRoleToUser("will", "ROLE_SUPER_ADMIN");
//            userService.addRoleToUser("will", "ROLE_USER");
//            userService.addRoleToUser("rambo", "ROLE_USER");
//
//        };
//    }
    @Bean
    public BCryptPasswordEncoder getBCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

