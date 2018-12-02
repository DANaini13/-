package com.shijikaitaiTec.workingSysServer;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shijikaitaiTec")
public class TrackingInfo {

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(@RequestBody String arg) {
        return "Hello world.";
    }
}
