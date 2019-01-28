package blue.springframework.springrest.controllers;

import blue.springframework.springrest.services.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;

@Slf4j
@Controller
public class UserController {

    private ApiService apiService;

    public UserController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping({"", "/", "/index"})
    public String index()
    {
        return "index";
    }

    @PostMapping("/users")
    public String formPost(Model model, ServerWebExchange serverWebExchange)
    {
//        MultiValueMap<String, String> map = ;
//
//        Integer limit = new Integer(1);
//
//        log.debug("Received Limit value: " + limit);
//
//        //default if null or zero
//
//        if (limit == null  || limit == 0)
//        {
//            log.debug("Setting limit to default of 10");
//            limit=10;
//        }
//
//        model.addAttribute("users", apiService.getUsersReactive(Mono.just(limit)));

//        model.addAttribute("users",
//                apiService
//                        .getUsers(serverWebExchange
//                                .getFormData()
//                                .map(data -> new Integer(data.getFirst("limit")))));

        return "userlist";
    }
}
