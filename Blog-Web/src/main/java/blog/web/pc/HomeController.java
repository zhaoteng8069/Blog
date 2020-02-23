package blog.web.pc;

import blog.interfaces.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HomeController
 * @Desc TODO
 * @Author zhaoteng
 * @Date 2020/2/23 18:12
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "home")
public class HomeController {

    @Autowired
    IHomeService homeService;

    @GetMapping(value = "sayHello")
    public String sayHello() {
        return homeService.sayHello();
    }

}
