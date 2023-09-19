package me.devlopery.actuatorstudy.counter;

import io.micrometer.core.annotation.Counted;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
@RequiredArgsConstructor
public class MetricsController {

    private final MyHttpRequestManager myHttpRequestManager;  // 생성자 주입

    @GetMapping("/req")
    @Counted("myCountedAnnotationCount")
    public String request() {
//        myHttpRequestManager.increase();  // counter 를 증가시킴
        return "ok";
    }

    @Counted("myCountedAnnotationCount")
    @GetMapping("/counted")
    public String counted() {
        return "ok";
    }

}
