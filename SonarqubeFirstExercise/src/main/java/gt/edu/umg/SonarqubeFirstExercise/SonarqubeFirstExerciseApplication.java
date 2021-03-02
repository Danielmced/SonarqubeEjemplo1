package gt.edu.umg.SonarqubeFirstExercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication


@RestController
public class SonarqubeFirstExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonarqubeFirstExerciseApplication.class, args);
	}

        @RequestMapping("/")
        public String index(){
        
        return "Hello World!!!!";
    }
}
