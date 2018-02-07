package com.baidu.dueros.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.dueros.samples.tax.TaxBot;
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
    public Object goSearchByKey(HttpServletRequest request, HttpServletResponse response) {
        // 根据request创建Bot
        TaxBot bot = null;
        try {
            bot = new TaxBot(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 打开签名验证
        // bot.enableVerify();

        // 线下调试时，可以关闭签名验证
        bot.disableVerify();

        try {
            // 调用bot的run方法
            String responseJson = bot.run();
            // 设置response的编码UTF-8
            response.setCharacterEncoding("UTF-8");
            // 返回response
            response.getWriter().append(responseJson);
        } catch (Exception e) {
            try {
                response.getWriter().append("{\"status\":1,\"msg\":\"\"}");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }


        Map<String, Object> map = new HashMap<String, Object>();
        map.put("111", "222");

        return map;
    }

}
