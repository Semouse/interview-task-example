package com.example.dto;

public class DataFilterDto {
    private final String propertyName;
    private final Operator operator;
    private final String value;

    public DataFilterDto(String propertyName, Operator operator, String value) {
        this.propertyName = propertyName;
        this.operator = operator;
        this.value = value;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public Operator getOperator() {
        return operator;
    }

    public String getValue() {
        return value;
    }

    public enum Operator {
        EQUALS("="),
        NOT_EQUALS("<>"),
        LIKE("LIKE");

        private final String value;

        Operator(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
