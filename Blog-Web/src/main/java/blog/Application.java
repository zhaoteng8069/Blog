package blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application
 * @Desc 启动类
 * @Author zhaoteng
 * @Date 2020/2/23 17:12
 * @Version 1.0
 **/
@SpringBootApplication(scanBasePackages = {"blog"})
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
        System.out.println("=========BLOG 启动成功==========");
    }
}
