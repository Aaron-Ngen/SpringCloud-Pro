package com.forezp.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @Author: Yuan Baiyu
 * @Date: Created in 21:59 2018/6/28
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}