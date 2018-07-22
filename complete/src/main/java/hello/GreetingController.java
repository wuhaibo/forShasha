package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class GreetingController {

    
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);//here the value of name is added to model of greeting.html
        return "greeting";
    }

    @RequestMapping(value="/greetingPost", method = RequestMethod.POST)
    @ResponseBody
    public String sayHello(@RequestBody String name) {
        return "hello " + name;
    }



}
