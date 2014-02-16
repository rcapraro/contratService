package com.capraro.controller;

import com.capraro.model.Contrat;
import com.capraro.model.ContratFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rcapraro on 16/02/2014.
 */
@RestController
@RequestMapping("/")
public class ContratController {

    @RequestMapping(value = "/contrat", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Contrat> getAll() {
        return ContratFactory.createContrats();
    }


}
