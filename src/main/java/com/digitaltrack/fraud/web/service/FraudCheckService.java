package com.digitaltrack.fraud.web.service;

import com.digitaltrack.fraud.model.entity.FraudCheckHistory;
import com.digitaltrack.fraud.repos.FraudCheckRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class FraudCheckService {
    private final FraudCheckRepo fraudCheckRepo;

    public Boolean isFraudulent(Long customerId){
        FraudCheckHistory fraudCheckHistory = FraudCheckHistory.builder()
                .customerId(customerId)
                .isFraudster(false)
                .createdAt(LocalDateTime.now()).build();
        fraudCheckRepo.save(fraudCheckHistory);
        return false;
    }
}
