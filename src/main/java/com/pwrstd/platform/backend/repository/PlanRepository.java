package com.pwrstd.platform.backend.repository;

import com.pwrstd.platform.backend.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, Long> {
}
