package edu.escuelaing.arep.service.controller;

import edu.escuelaing.arep.service.services.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
    @Autowired
    CalculateService calculateService;

    @GetMapping("/power")
    public ResponseEntity<?> getSquareRoot(@RequestParam(value = "number") Integer number) {
        return new ResponseEntity<>(calculateService.calculate(number), HttpStatus.OK);
    }
}
