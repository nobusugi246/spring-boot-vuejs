package proto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import proto.entity.User;
import proto.entity.UserRepository;

@Controller
public class DefaultController {

    @Autowired
    private UserRepository repository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/setData", method = RequestMethod.GET)
    public String setData() {
        repository.save(new User("1", "Jonh", "Snow"));
        return "index";
    }
}
