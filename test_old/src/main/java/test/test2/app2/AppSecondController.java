package test.test2.app2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppSecondController {

    @GetMapping("app2")
    public String app2() {
        return "it's app second !!!!!!!!!!!!!!!!!!!!!!!";
    }
}
