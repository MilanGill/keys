package com.likesoft24;

import org.springframework.stereotype.Component;

@Component
public class NeonMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
