package com.praveen.springbeanscope.mvc2;

import com.praveen.springbeanscope.bean.ApplicationBean;
import com.praveen.springbeanscope.bean.SingletonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api2")
public class Controller2 {

    @Autowired private ApplicationBean applicationBean;
    @Autowired private SingletonBean singletonBean;

    @ResponseBody
    @RequestMapping("/accessValue")
    public String accessValue(){
        return "App2 >>>> Application Bean value "+applicationBean.getNum()
                + "SingletonBean Value " + singletonBean.getNum();
    }
}
