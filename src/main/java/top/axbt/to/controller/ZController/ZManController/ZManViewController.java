package top.axbt.to.controller.ZController.ZManController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Create by 张晨彬
 * 2018/12/6/006 16:01
 */

@RequestMapping("man_page")
@Controller
public class ZManViewController {

    /**
     * login
     */
    @RequestMapping("login")
    public ModelAndView login(@RequestParam("username") String username,@RequestParam("password") String password){
        ModelAndView modelAndView = new ModelAndView();

        if(username.equals("admin")&&password.equals("admin")){
            modelAndView.setViewName("man/index.html");
            return modelAndView;
        }

        modelAndView.setViewName("man/login.html");
        return modelAndView;
    }
}
