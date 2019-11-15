package com.springcrud.demo;

import com.springcrud.demo.repository.UsersRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    private static UsersRepository usersRepository;

    public DemoApplication(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
