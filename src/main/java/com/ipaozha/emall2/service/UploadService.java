package com.ipaozha.emall2.service;

import com.ipaozha.emall2.pojo.Icon;
import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
    Icon addImage(String name, MultipartFile image);
}
