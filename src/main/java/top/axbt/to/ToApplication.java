package top.axbt.to;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.axbt.to.dao")
public class ToApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToApplication.class, args);
    }
}
