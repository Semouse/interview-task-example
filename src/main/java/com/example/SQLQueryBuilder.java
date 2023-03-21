package com.example;

import com.example.dto.DataFilterDto;

import java.util.List;
import java.util.stream.Collectors;

public class SQLQueryBuilder {

    private static final String queryBase = "SELECT * FROM table WHERE %s";

    public String buildQuery(List<DataFilterDto> filters) {
        return String.format(queryBase, translateWhereClause(filters));
    }

    public String translateWhereClause(List<DataFilterDto> filters) {
        return filters.stream().map(SQLQueryBuilder::formatClause).collect(Collectors.joining(" AND "));
    }

    private static String formatClause(DataFilterDto filter) {
        return String.format("%s %s \"%s\"", filter.getPropertyName(), filter.getOperator().getValue(),
            filter.getValue());
    }

}
