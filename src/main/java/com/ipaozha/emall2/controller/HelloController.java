package com.ipaozha.emall2.controller;

import com.ipaozha.emall2.pojo.Icon;
import com.ipaozha.emall2.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UploadService uploadService;

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
    public String uploadAction(@RequestParam("name") String name,@RequestParam("file") MultipartFile file) {

        Icon icon = uploadService.addImage(name,file);
        if (icon.getIcon() != null) {
            return "上传成功";
        }else  {
            return  "上传失败";
        }

    }
}
