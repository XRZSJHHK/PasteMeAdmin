package cn.pasteme.admin.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lucien
 * @version 1.0.1
 */
@Configuration
@MapperScan(value = {"cn.pasteme.admin.mapper"})
public class PasteMeAdminMapperConfiguration {
}
