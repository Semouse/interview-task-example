package com.example;

import com.example.dto.DataFilterDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQLQueryBuilderTest {

    SQLQueryBuilder queryBuilder = new SQLQueryBuilder();

    @Test
    public void testTranslate() {
        List<DataFilterDto> filters = List.of(
            new DataFilterDto("name", DataFilterDto.Operator.EQUALS, "Leanid"),
            new DataFilterDto("email", DataFilterDto.Operator.EQUALS, "l@gmail.com")
        );

        String query = queryBuilder.buildQuery(filters);

        assertEquals("SELECT * FROM table WHERE name = \"Leanid\" AND email = \"l@gmail.com\"", query);
    }
}