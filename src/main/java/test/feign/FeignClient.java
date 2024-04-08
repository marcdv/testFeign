package test.feign;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(url = "https://jsonplaceholder.typicode.com/", path = "todos/", value = "feignClient")
public interface FeignClient {

    @GetMapping(value = "1", headers = {"Content-Type=application/json"})
    String callAPI();

}
