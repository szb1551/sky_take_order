package com.sky.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sky.properties.AliOssProperties;
import com.sky.utils.AliOssUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * 配置类
 */
@Configuration
@ComponentScan
@Slf4j
public class OssConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public AliOssUtil aliOssUtil(AliOssProperties aliOssProperties){
        log.info("Begin Create 开始创建阿里云文件上传工具类对象,{}", aliOssProperties);
        return new AliOssUtil(aliOssProperties.getEndpoint(),
        aliOssProperties.getAccessKeyId(),
        aliOssProperties.getAccessKeySecret(),
        aliOssProperties.getBucketName());
    }
}
