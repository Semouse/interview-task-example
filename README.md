
There is DTO describing data filters. Implement something that takes list of DTOs and returns SQL query.

```
public class DataFilterDto {

    private String propertyName;
    private Operator operator;
    private String value;

    public enum Operator { EQUALS, NOT_EQUALS, LIKE }

}
```