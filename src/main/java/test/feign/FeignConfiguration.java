package test.feign;

import feign.okhttp.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    @Bean
    public OkHttpClient feignClient()  {
        OkHttpClient okHttpClient = new OkHttpClient();
        return okHttpClient;
    }

}