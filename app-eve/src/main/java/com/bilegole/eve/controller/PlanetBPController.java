package com.bilegole.eve.controller;

import com.bilegole.eve.dao.repository.BPItemInputRepository;
import com.bilegole.eve.dao.repository.BPItemRepository;
import com.bilegole.eve.dao.repository.BPRepository;
import com.bilegole.eve.model.entity.Industry.BP;
import com.bilegole.eve.model.entity.Industry.BPItemInput;
import com.bilegole.eve.model.entity.Industry.BPItems;
import com.bilegole.eve.model.entity.Industry.PlanetIndustry.PlanetBP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/bp/planet_industry")
public class PlanetBPController {
    @Autowired
    BPRepository bpRepository;

    @Autowired
    BPItemRepository bpItemRepository;

    @Autowired
    BPItemInputRepository bpItemInputRepository;

    @RequestMapping(path = "/test1", method = RequestMethod.POST)
    public String test1(){
        return "test1";
    }

    @RequestMapping(path = "/" , method = RequestMethod.POST)
    public List<BP> getAllPlanetBP(){
        return bpRepository.findAll();
    }

    @RequestMapping(path = "/items")
    public List<BPItems> getAllBPItems(){
        return bpItemRepository.findAll();
    }

    @RequestMapping(path = "/inputs")
    public List<BPItemInput> getAllInputBPItems(){
        return bpItemInputRepository.findAll();
    }

}
