package top.axbt.to.controller.ZController.ZCusController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by 张晨彬
 * 2018/12/1/001 16:33
 */


@Controller
@RequestMapping("cus_view")
public class ZCusController {

    @RequestMapping("temp")
    public ModelAndView temp(){
        String message = "保存成功";
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ob",message);
        modelAndView.setViewName("temp.html");

        return modelAndView;
    }
}
