package com.ipaozha.emall2.controller;

import com.ipaozha.emall2.common.ServerResp;
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

import java.util.List;

/**
 * Created by syk on 2018/8/25.
 */
@Controller
public class HelloController {

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

    @RequestMapping(value = "/uploadAction", method = RequestMethod.POST)
    @ResponseBody
    public ServerResp<Icon> uploadAction(@RequestParam("name") String name,@RequestParam("file") MultipartFile file) {

        Icon icon = uploadService.addImage(name,file);
        if (icon.getIcon() != null) {
            return ServerResp.success(icon);
        }else  {
            return  ServerResp.error();
        }

    }

    @RequestMapping(value = "/getIcon", method = RequestMethod.GET)
    @ResponseBody
    public ServerResp<List<Icon>> getIcon(@RequestParam(value = "pageNum",defaultValue = "0") Integer pageNum,@RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize) {
        System.out.println(pageNum);
        System.out.println(pageSize);
        return null;
    }
}
