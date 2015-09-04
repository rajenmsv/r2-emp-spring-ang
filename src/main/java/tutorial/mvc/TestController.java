package tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sbhupathiraju on 9/4/15.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test() {

        System.out.println("Inside the test controller");
        return "view";
    }
}
