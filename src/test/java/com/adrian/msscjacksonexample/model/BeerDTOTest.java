package com.adrian.msscjacksonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDTOTest extends BaseTest {

    @Test
    void testSerializeDTO() throws JsonProcessingException {
        BeerDTO beerDTO = getBeerDTO();

        String jsonString = objectMapper.writeValueAsString(beerDTO);

        System.out.println(jsonString);
    }

    @Test
    void testDeserializeDTO() throws JsonProcessingException {
        String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":13213131,\"price\":\"12.45\"," +
                "\"createdDate\":\"2022-07-06T09:52:38+0200\"," +
                "\"lastUpdatedDate\":\"2022-07-06T09:52:38.2290454+02:00\",\"myLocalDate\":\"20220706\"," +
                "\"beerId\":\"ae3f7d01-29c9-4495-9d30-2d727ec983c0\"}\n";

        BeerDTO beerDTO = objectMapper.readValue(json, BeerDTO.class);

        System.out.println(beerDTO);
    }
}