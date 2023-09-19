package me.devlopery.actuatorstudy.counter;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class MyHttpRequestManagerWithoutMicrometer {

    private AtomicLong count = new AtomicLong(0);

    public long getCount() {
        return count.get() + System.currentTimeMillis();
    }

    public void increse() {
        count.incrementAndGet();
    }
}
