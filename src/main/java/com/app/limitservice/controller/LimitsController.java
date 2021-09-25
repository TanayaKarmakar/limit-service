package com.app.limitservice.controller;

import com.app.limitservice.config.LimitsConfig;
import com.app.limitservice.models.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author t0k02w6 on 25/09/21
 * @project limit-service
 */
@RestController
@RequestMapping("/limits")
public class LimitsController {
    @Autowired
    private LimitsConfig limitsConfig;

    @GetMapping
    public Limits retrieveLimits() {
        return new Limits(limitsConfig.getMinimum(), limitsConfig.getMaximum());
    }
}
