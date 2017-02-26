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
    
    /**
     * 初期画面を表示する
     * @return 初期画面へ遷移
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    /**
     * データを設定する
     * @return 初期画面へ遷移
     */
    @RequestMapping(value = "/setData", method = RequestMethod.GET)
    public String setData() {
        repository.save(new User("一郎", "舞黒", "説明１"));
        repository.save(new User("二郎", "舞黒", "説明２"));
        repository.save(new User("三郎", "舞黒", "説明３"));
        return "index";
    }
}
