package jp.co.prospire.trainingfunding.controller;

import jp.co.prospire.trainingfunding.dao.TFUserDao;
import jp.co.prospire.trainingfunding.domain.TFUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private TFUserDao tfUserDao;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        return "login";
    }

    // TODO: サンプル用メソッドなので不要です。
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        List<TFUser> tfUserList = tfUserDao.selectTFUserAll();
        model.addAttribute("login_url", "login");
        model.addAttribute("tfUserList", tfUserList);
        return "home";
    }

    // TODO: サンプル用メソッドなので不要です。
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

}
