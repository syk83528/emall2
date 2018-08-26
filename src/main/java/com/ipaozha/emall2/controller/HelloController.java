package com.ipaozha.emall2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by syk on 2018/8/25.
 */
@Controller
public class HelloController {

    @Value("${adImage.savePath}")
    private String imageSavePath;

    @RequestMapping("/hello")
    public static String hello() {
        return "/upload/hello";
    }

    @RequestMapping("/upload")
    public static String upload() {
        return "/upload/upload";
    }

    @RequestMapping(value = "/upload.do", method = RequestMethod.POST)
    @ResponseBody
    public static String uploadAction(@RequestParam("name") String name,@RequestParam("file") MultipartFile file) {
        if (file != null) {
            return name + "文件传过来啦!" + file.getOriginalFilename();
        }
        return "asd";
    }
}
