package test.test1.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppFirstController {


    @GetMapping("app1")
    @ResponseBody
    public String app1() {
        return "it's app first !!!!!!!!!!!!!!!!!!!!!!!";
    }

    @GetMapping("app1/1")
    @ResponseBody
    public String app11() {
        return "it's app first-1 !!!!!!!!!!!!!!!!!!!!!!!";
    }

}
