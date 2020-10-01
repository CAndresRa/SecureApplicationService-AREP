package edu.escuelaing.arep.service.services.impl;

import edu.escuelaing.arep.service.services.CalculateService;
import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {

    public Integer calculate(int number) {
        return (int)Math.pow(number,2);
    }
}
