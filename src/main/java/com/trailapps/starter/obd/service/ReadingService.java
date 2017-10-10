package com.trailapps.starter.obd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.trailapps.starter.obd.model.ObdReading;
import com.trailapps.starter.obd.repository.ObdReadingRepository;

@Service
public class ReadingService {

    @Autowired
    private ObdReadingRepository repo;

    public ObdReading createReading(ObdReading reading) {
        return repo.save(reading);
    }

    public ObdReading getReading(long id) {
        return repo.findOne(id);
    }

    public Page<ObdReading> getAllReadingsFromVin(String vin, Integer page, Integer size) {
        return repo.findAllByVin(vin, new PageRequest(page, size));
    }
    
    public Iterable<ObdReading> getAllReadings()
    {
    	return repo.findAll();
    }

}
