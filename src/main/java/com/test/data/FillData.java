package com.test.data;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @date 2021/12/9 5:02 PM
 */
@Getter
@Setter
@EqualsAndHashCode
public class FillData {
    private String name;
    private double number;
    private Date date;
}
