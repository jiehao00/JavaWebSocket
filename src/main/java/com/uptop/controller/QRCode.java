package com.uptop.controller;

import com.uptop.utils.QRCodeUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class QRCode {


    @RequestMapping(value = "/text",method = RequestMethod.GET)
    public static String test() throws Exception {
        //String text = "119.29.134.245:8080/JavaWebSocket/";
        String text="D:\\git_code\\chat\\src\\main\\webapp\\login.jsp";
        System.out.println("=================");
        //不含Logo
        //QRCodeUtil.encode(text, null, "e:\\", true);
        //含Logo，不指定二维码图片名
        //QRCodeUtil.encode(text, "e:\\csdn.jpg", "e:\\", true);
        //含Logo，指定二维码图片名
        QRCodeUtil.encode(text, "D:\\git_code\\chat\\src\\main\\webapp\\images\\delete.png", "D:\\", "qrcode", true);
        return "redirect:/login.jsp";
    }
}
