package me.devlopery.actuatorstudy.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class MyCustomInfoContributor implements InfoContributor {

    final private List<ApplicationContext> ac;

    public MyCustomInfoContributor(List<ApplicationContext> ac) {
        this.ac = ac;
    }

    @Override
    public void contribute(Info.Builder builder) {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        builder.withDetail("myCustomInfo", map);
    }
}
