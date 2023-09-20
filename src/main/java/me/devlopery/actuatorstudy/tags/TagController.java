package me.devlopery.actuatorstudy.tags;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tag")
@RequiredArgsConstructor
@Slf4j
public class TagController {
    private final MyQueueManagerWithTags myQueueManagerWithTags;

    @GetMapping("/push")
    public String push() {
        myQueueManagerWithTags.push();
        return "ok";
    }


    @GetMapping("/pop")
    public String pop() {
        myQueueManagerWithTags.pop();
        return "ok";
    }
}
