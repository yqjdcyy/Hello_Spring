package com.yao.ioc.processor.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Yao
 * @date 2019/11/3 9:23
 */
@Data
@NoArgsConstructor
@Component
public class User {

    @Value("1")
    private Long id;
    @Value("Yao")
    private String name;
    private Integer age;
}
