package ktds.cloud.cloudkvtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created By Cheetah on 2025-06-18.
 */
@Controller
public class Main {

    @GetMapping("/")
    public String helloWorld() {

        return "index";
    }
}
