package me.devlopery.actuatorstudy.counter;

import io.micrometer.core.instrument.FunctionCounter;
import io.micrometer.core.instrument.MeterRegistry;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyFunctionCounterConfig {

    private final MyHttpRequestManagerWithdoutMicrometer myManager;
    private final MeterRegistry meterRegistry;

    @PostConstruct
    void init() {
        FunctionCounter.builder("myHttpRequestManagerWithdoutMicrometer", myManager, myManager -> {
            return myManager.getCount();
        }).register(meterRegistry);
    }
}
