package io.spring.ExceptionHandling;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/api")
    public void message() throws CustomException {
        throw new CustomException();
    }
}
