package blog.services;

import blog.interfaces.IHomeService;
import org.springframework.stereotype.Service;

/**
 * @ClassName HomeService
 * @Desc TODO
 * @Author zhaoteng
 * @Date 2020/2/23 18:18
 * @Version 1.0
 **/
@Service
public class HomeService implements IHomeService {


    @Override
    public String sayHello() {
        return "hello~~";
    }
}
