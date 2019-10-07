package com.qf.controller.api;

import com.qf.entity.Classes;
import com.qf.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cls/api")
public class ClassController {

    @Autowired
    private IClassService classService;

    @RequestMapping("/queryByCid/{cid}")
    @ResponseBody
    public Classes queryStudentList(@PathVariable Integer cid){
        Classes classes = classService.queryByCid(cid);
        return classes;
    }
}
