package com.kirilo.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getFormHome() {
        return "home";
    }
}
