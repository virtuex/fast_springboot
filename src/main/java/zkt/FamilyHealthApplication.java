package zkt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("zkt.dao")
@Configuration
@EnableSpringDataWebSupport
public class FamilyHealthApplication {
    public static void main(String[] args) {
        SpringApplication.run(FamilyHealthApplication.class, args);
    }
}
