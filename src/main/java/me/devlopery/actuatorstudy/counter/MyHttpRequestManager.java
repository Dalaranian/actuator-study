package me.devlopery.actuatorstudy.counter;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyHttpRequestManager {
    private final MeterRegistry meterRegistry;

    private Counter httpRequestCounter;

    /**
     * Registry 등록
     */
    @PostConstruct
    void init() {
        httpRequestCounter = Counter.builder("my.Http.Request")
                .register(meterRegistry);
    }

    /**
     * counter 를 증가시킬 필요가 있을 때, 외부에서 이 메서드를 호출
     */
    public void incerase() {
        httpRequestCounter.increment();
    }
}
