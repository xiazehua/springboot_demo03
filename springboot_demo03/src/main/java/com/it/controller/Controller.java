package com.it.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Software：IntelliJ IDEA 2020.1 x64
 * CassName:      Controller
 * Author:         夏泽华
 * Date:           2020/12/13 22:42
 * 描述：
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "你好呀！hhnnnuuuuwuuwuw";
    }

}
