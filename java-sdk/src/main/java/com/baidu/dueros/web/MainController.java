package com.baidu.dueros.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.intellij.util.io.Page;

@Controller
@RequestMapping("/weilx")
public class MainController {


    /**
     * 列表展示
     *
     *
     * @return
     */
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    @ResponseBody
    public Object goSearchByKey() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("111", "222");

        return map;
    }

}
