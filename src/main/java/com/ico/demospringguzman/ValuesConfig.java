package com.ico.demospringguzman;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
// @PropertySource("classpath:values.properties")
@PropertySources({
        @PropertySource(value = "classpath:values.properties", encoding = "UTF-8")
})
public class ValuesConfig {
}
