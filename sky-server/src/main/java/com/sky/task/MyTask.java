package com.sky.task;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;


/**
 * 自定义定时任务类
 */
@Component
@Slf4j
public class MyTask {
    /**
     * 定时任务，每5秒触发一次
     */
    //@Scheduled(cron="0/5 * * * * ?")
    public void executeTask(){
        log.info("定时任务开始执行:{}",new Date());
    }
}
