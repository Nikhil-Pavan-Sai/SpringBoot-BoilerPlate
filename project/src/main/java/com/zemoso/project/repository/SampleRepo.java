package com.zemoso.project.repository;

import com.zemoso.project.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepo extends JpaRepository<Sample, Long> {
}