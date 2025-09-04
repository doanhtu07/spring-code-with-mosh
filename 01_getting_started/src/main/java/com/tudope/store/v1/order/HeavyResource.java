package com.tudope.store.v1.order;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HeavyResource {
    public HeavyResource() {
        System.out.println("HeavyResource created");
    }
}
