package com.digitaltrack.fraud.web.controller;

import com.digitaltrack.clients.fraud.FraudCheckResponse;
import com.digitaltrack.fraud.web.service.FraudCheckService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("frauds")
@Slf4j
public class FraudCheckController {
    private final FraudCheckService fraudCheckService;

    @GetMapping("/{customerId}")
    public FraudCheckResponse isFraudulent(@PathVariable("customerId") Long customerId) {
        log.info("isFraudulent start");
        Boolean fraudulent = fraudCheckService.isFraudulent(customerId);
        return new FraudCheckResponse(fraudulent);
    }
}
