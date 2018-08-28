package com.ipaozha.emall2.service.impl;

import com.ipaozha.emall2.dao.IconMapper;
import com.ipaozha.emall2.pojo.Icon;
import com.ipaozha.emall2.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service("uploadService")
public class UploadServiceImpl implements UploadService {

    @Value("${adImage.savePath}")
    private String savePath;
    @Value("${adImage.urlsavePath}")
    private String imageURL;

    @Autowired
    private IconMapper iconMapper;

    @Override
    public Icon addImage(String name, MultipartFile image) {
        Icon icon = new Icon();
        icon.setIcon(name);
        if (image.getSize() > 0) {
            String imageName = System.currentTimeMillis() + "_" + image.getOriginalFilename();
            File imageFile = new File(savePath + imageName);
            //判断文件夹是否存在
            File folder = new File(savePath);
            if (!folder.exists()) {
                folder.mkdir();
            }
            //存图片
            try {
                image.transferTo(imageFile);
                icon.setIcon(imageName);
                iconMapper.insertSelective(icon);
                return icon;
            } catch (IOException e) {
                e.printStackTrace();
                return icon;
            }
        }else {
            return icon;
        }
    }
}