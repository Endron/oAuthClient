package io.github.endron.oauth.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = GET)
    @ResponseBody
    public String get(final Principal principal) {
        System.out.println(principal);

        return "Hello " + principal.getName();
    }
}
