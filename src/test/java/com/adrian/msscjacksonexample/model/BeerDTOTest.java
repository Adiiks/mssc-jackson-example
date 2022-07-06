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
        String json = "{\"id\":\"58288889-296d-4374-9ffe-d08290b73df9\",\"beerName\":\"BeerName\"," +
                "\"beerStyle\":\"Ale\",\"upc\":13213131,\"price\":12.45," +
                "\"createdDate\":\"2022-07-05T11:21:44.4023278+02:00\"," +
                "\"lastUpdatedDate\":\"2022-07-05T11:21:44.4023278+02:00\"}\n";

        BeerDTO beerDTO = objectMapper.readValue(json, BeerDTO.class);

        System.out.println(beerDTO);
    }
}