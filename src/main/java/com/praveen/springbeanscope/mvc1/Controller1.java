package com.praveen.springbeanscope.mvc1;

import com.praveen.springbeanscope.bean.ApplicationBean;
import com.praveen.springbeanscope.bean.SingletonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api1")
public class Controller1 {

    @Autowired private ApplicationBean applicationBean;
    @Autowired private SingletonBean singletonBean;

    @ResponseBody
    @RequestMapping("/updateValue")
    public String test(){

        // update num value
        applicationBean.setNum(5);

        singletonBean.setNum(5);

        return "App1 >>> ApplicationBean Value " + applicationBean.getNum()
                + "Singleton Bean value" + singletonBean.getNum();
    }
}
