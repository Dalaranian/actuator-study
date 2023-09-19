package me.devlopery.actuatorstudy.counter;

import io.micrometer.core.instrument.FunctionCounter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CounterConfigWithMeterBinder {

    @Bean
    public MeterBinder myTimerWithMeterBinder(MyHttpRequestManagerWithoutMicrometer manager) {
        return new MeterBinder() {
            @Override
            public void bindTo(MeterRegistry meterRegistry) {
                FunctionCounter.builder("my.HttpRequest.Manager.Without.Micrometer", manager, MyHttpRequestManagerWithoutMicrometer::getCount).register(meterRegistry);
            }
        };
    }
}
