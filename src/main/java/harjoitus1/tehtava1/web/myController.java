package harjoitus1.tehtava1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class myController {

    @RequestMapping("/main")
    @ResponseBody

    public String returnMessage( 
        @RequestParam String location,
        @RequestParam String name) {
            return "Welcome to the " + location + " " + name + "!";
        }

    }

