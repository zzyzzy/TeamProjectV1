package project.abc123.teamprojectv1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ZzyzzyController {

    @GetMapping("/zzyzzy")
    public String index() {
        return "views/zzyzzy";
    }

}
