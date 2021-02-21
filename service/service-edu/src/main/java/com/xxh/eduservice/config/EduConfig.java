package com.xxh.eduservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.xxh.eduservice.mapper")
public class EduConfig {
}
