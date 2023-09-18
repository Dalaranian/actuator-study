package me.devlopery.actuatorstudy.custommetrics;

import org.springframework.stereotype.Component;

@Component
public class MyStockManager {
    public long getStock(){
        return System.currentTimeMillis();
    }
}
