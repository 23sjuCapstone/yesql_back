package com.appletantam.yesql_back.manage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
public class SchemaDTO {
    String table;
    ArrayList columns;
    ArrayList rows;
}
