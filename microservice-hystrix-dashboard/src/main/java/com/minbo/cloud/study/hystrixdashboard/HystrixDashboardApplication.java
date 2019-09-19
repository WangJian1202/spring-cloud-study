package com.minbo.cloud.study.hystrixdashboard;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 测试步骤: 
 * 1. 访问：http://localhost:8030/hystrix 可以查看Dashboard 
 * 2. 在上面的输入框填入: http://想监控的服务:端口/hystrix.stream进行测试
 * 如果使用springboot2.0 和spring cloud Finchley.M8 版本搭建 使用（/actuator/hystrix.stream  而不是/hystrix.stream 为插入点）
 *
 * 
 * 注意：首先要先调用一下想监控的服务的API，否则将会显示一个空的图表.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(HystrixDashboardApplication.class).run(args);
	}
}
