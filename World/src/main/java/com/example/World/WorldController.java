package com.example.World;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WorldController {
    @RequestMapping("/World")
    public String World()
    {
        return "World";
    }
}
