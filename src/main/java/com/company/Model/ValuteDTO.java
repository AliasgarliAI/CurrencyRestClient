package com.company.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValuteDTO {
    private String date;
    private String code;
    private String valuteName;
    private double value;
}
