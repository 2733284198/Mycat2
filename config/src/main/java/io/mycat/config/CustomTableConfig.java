package io.mycat.config;

import lombok.*;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class CustomTableConfig {
    String createTableSQL;
    String clazz;
    Map<String,String> kvOptions;
    List<String> listOptions;
}