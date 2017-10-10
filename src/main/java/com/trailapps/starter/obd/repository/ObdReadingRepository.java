package com.trailapps.starter.obd.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.trailapps.starter.obd.model.ObdReading;

/**
 * DAO for {@link ObdReading}.
 */
public interface ObdReadingRepository extends PagingAndSortingRepository<ObdReading, Long> {

    Page<ObdReading> findAllByVin(String vin, Pageable pageable);

}
