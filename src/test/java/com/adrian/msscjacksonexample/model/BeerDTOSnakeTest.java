package com.adrian.msscjacksonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
public class BeerDTOSnakeTest extends BaseTest {

    @Test
    void testSnake() throws JsonProcessingException {
        BeerDTO beerDTO = getBeerDTO();

        String json = objectMapper.writeValueAsString(beerDTO);

        System.out.println(json);
    }
}
