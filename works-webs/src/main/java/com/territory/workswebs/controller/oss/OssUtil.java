package com.territory.workswebs.controller.oss;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.OSS;
import com.aliyun.oss.model.PutObjectResult;
import com.territory.worksservice.exception.code.BaseResponseCode;
import com.territory.workswebs.utils.BaseResponse;
import com.territory.workswebs.utils.Expiration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/fileSupport")
public class OssUtil {


    @Value("${oss.buckName}")
    private String BUCKNAME;

    final OSS oss;

    public OssUtil(OSS oss){
        this.oss =oss;
    }

    // 无脑上传，这里不做任何校验，只要传过来东西就传OSS
    @PostMapping("/upload")
    public BaseResponse upload( MultipartFile file) throws IOException, ParseException {
        if (file == null) {
            return new BaseResponse<>(BaseResponseCode.DATA_ERROR);
        }
        String fileName =  file.getOriginalFilename();
        boolean b = oss.doesObjectExist(BUCKNAME,fileName);
        if (b){
            // 如果存在了，前面加一个时间戳 ~~
            fileName =System.currentTimeMillis()+fileName;
        }
        PutObjectResult putObjectResult = oss.putObject(BUCKNAME, fileName, file.getInputStream());

        if (StringUtils.isEmpty( putObjectResult.getETag())){
            return new BaseResponse<>(BaseResponseCode.OPERATION_ERROR);
        }
        URL url = oss.generatePresignedUrl(BUCKNAME, fileName, Expiration.getExpiration());
        return new BaseResponse<>(url);
    }

    @PostMapping("/delete")
    public BaseResponse delete(MultipartFile file) throws IOException {
        if (file == null) {
            return new BaseResponse<>(BaseResponseCode.DATA_ERROR);
        }
        oss.deleteObject(BUCKNAME, file.getOriginalFilename());
        return new BaseResponse<>();
    }


}
