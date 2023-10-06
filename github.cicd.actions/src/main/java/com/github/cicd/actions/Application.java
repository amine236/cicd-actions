package com.github.cicd.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class Application {

	@GetMapping("/welcome")
	public String welcome() {
		return " Welcome aboard " ;
	}
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin git@github.com:amine236/cicd-actions-.git
//	git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
