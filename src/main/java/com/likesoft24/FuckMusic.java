package com.likesoft24;

import org.springframework.stereotype.Component;

@Component
public class FuckMusic implements Music{
    @Override
    public String getSong() {
        return "Oh Oh Oh Oh";
    }
}
