package com.version6.demo6.Controllers;



import com.version6.demo6.Models.PageAccess;
import com.version6.demo6.Models.User;
import com.version6.demo6.Repositories.PageAccessRepository;
import com.version6.demo6.Services.AccessService;
import com.version6.demo6.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import javax.persistence.Access;
import javax.validation.Valid;

@Controller

public class UserController {

//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private AccessService accessService;
@Autowired
private PageAccessRepository pageAccessRepository;

    public UserController() {
    }

    public UserController(PageAccessRepository pageAccessRepository) {
        this.pageAccessRepository = pageAccessRepository;
    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String login(Model model, String error, String logout) {
//
//        if (error != null)
//            model.addAttribute("error", "Your username and password is invalid.");
//
//        if (logout != null)
//            model.addAttribute("message", "You have been logged out successfully.");
//
//        return "page-login";
//    }
//
//    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
//    public ModelAndView registration(ModelAndView modelAndView) {
//
//
//
//        User user=new User();
//        modelAndView.addObject("user", user);
//        modelAndView.setViewName("page-signUp");
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
//    public ModelAndView registration(ModelAndView modelAndView, @Valid User user) {
//
//
//
//        modelAndView.setViewName("redirect:/usersConfig");
//        return modelAndView;
//    }
//
//
//


    @RequestMapping(value = "/pageAccess", method = RequestMethod.GET)
    public ModelAndView pageAccess(ModelAndView modelAndView) {
        PageAccess pageAccess=new PageAccess();
        pageAccess.setAdminRole(true);
        pageAccess.setPanelAdminRole(true);
        pageAccess.setUserRole(true);
        modelAndView.addObject("pageAccess",pageAccessRepository.findAll());
        modelAndView.setViewName("page-access");

        return modelAndView;
    }

   /* @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView,BindingResult bindingResult) {

        accessValidator.validate("page-adminIndex",bindingResult);
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("page-index");
            return modelAndView;
        }

        modelAndView.setViewName("page-adminIndex");
        return modelAndView;
    }*/
}
