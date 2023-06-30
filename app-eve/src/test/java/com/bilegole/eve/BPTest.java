package com.bilegole.eve;

import com.bilegole.eve.dao.repository.BlueprintRepository;
import com.bilegole.eve.model.entity.Industry.BP;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class BPTest {
    @Autowired
    BlueprintRepository blueprintRepository;

    ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    @Test
    public void test() throws JsonProcessingException {
        Optional<BP> bp = blueprintRepository.findById(1L);
        String res = objectMapper.writeValueAsString(bp);
        System.out.println(res);
    }
}
