package com.wukong.generator.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableInfo {
    private String tableName;
    private String domainObjectName;
    private String pKeyFieldName;

}
