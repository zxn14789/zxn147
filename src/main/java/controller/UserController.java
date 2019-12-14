package controller;

import User.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@RestController
public class UserController {

    @RequestMapping("/index")
    public ModelAndView init(User user){
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("index");
        return mv;
    }

    /**
     * 注册
     * @param user 视图层传给控制层的表单对象
     * @param result 数据校验结果
     */
    @PostMapping("/register")
    public ModelAndView Register(@Valid User user, BindingResult result) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        if (result.hasErrors()) {
            mv.setViewName("index");
            return mv;
        }
        mv.setViewName("success");
        return mv;
    }

}
