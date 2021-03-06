package pl.mpas.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping({"/","/home"})
    public String welcome(){
        return"welcome";
    }

    @GetMapping({"/car"})
    public String myFavoriteCar(Model model)
    {
        model.addAttribute("car", "audi");
        model.addAttribute("typ", "80");
        return "car";
    }


    @GetMapping("/me")
    public String me(Model model){

        model.addAttribute("name", "Marcin");
        model.addAttribute("surname", "I.");


        return "me";
    }
}
