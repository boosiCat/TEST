package com.clg.config;

import com.clg.entity.LombokTestEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 小台
 * @Date 2019/4/22
 */
@Configuration
public class BeanTest {

    public BeanTest(){
        System.out.println("============");
    }

    @Bean("lombokTestEntity")
    public LombokTestEntity initA(){
        System.out.println("---------initA-----------");
        LombokTestEntity  lombokTestEntity = new  LombokTestEntity();
        lombokTestEntity.setId(1).setPassWord(123);
        return lombokTestEntity;
    }
    @Bean("LombokTestEntity")
    public LombokTestEntity initB(){
        System.out.println("---------initB-----------");
        LombokTestEntity  LombokTestEntity = new  LombokTestEntity();
        LombokTestEntity.setId(1).setPassWord(321);
        return LombokTestEntity;
    }

}
