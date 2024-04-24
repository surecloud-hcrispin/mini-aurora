package main.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Custom error handling logic or return error page
        return "error"; // Assuming "error.html" is your error page template
    }

    //@Override
    public String getErrorPath() {
        return "/error";
    }
}