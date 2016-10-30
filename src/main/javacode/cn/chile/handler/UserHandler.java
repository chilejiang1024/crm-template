package cn.chile.handler;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

import cn.chile.entity.User;
import cn.chile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Locale;

/**
 * Created by chile on 2016/10/29.
 */

@RequestMapping("/user")
@Controller
public class UserHandler {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String userLogin(@RequestParam("username") String name,
                        @RequestParam("password") String password,
                        HttpSession session) {

        User user = userService.login(name, password);

        if (user == null) {
            return "redirect:/index";
        }
        session.setAttribute("user", user);

        return "home/success";
    }
}
