package IMPRIMIS.progettino;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("IMPRIMIS.progettino.mapper")
public class ProgettinoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgettinoApplication.class, args);
	}

}
