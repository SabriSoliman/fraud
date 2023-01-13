package com.digitaltrack.fraud.repos;

import com.digitaltrack.fraud.model.entity.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckRepo extends JpaRepository<FraudCheckHistory,Long> {
}
