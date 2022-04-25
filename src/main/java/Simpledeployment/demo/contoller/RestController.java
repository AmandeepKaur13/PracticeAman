package Simpledeployment.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @GetMapping("/")
    public RedirectView first()
    {
        return new RedirectView("actuator") ;
    }
}
