package com.hxz.example.springbootdemo.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogTask {

    @Scheduled(cron = "*/10 * * * * ?")
    public void printLog() {
        log.info("thread name:{},log times:{}", Thread.currentThread().getName(),System.currentTimeMillis());
        log.warn("thread name:{},log times:{}", Thread.currentThread().getName(),System.currentTimeMillis());
        log.error("thread name:{},log times:{}", Thread.currentThread().getName(),System.currentTimeMillis());
    }

}
