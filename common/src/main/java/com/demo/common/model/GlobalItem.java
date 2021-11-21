package com.demo.common.model;


import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class GlobalItem implements Serializable {
    Integer id;
    String keyColumn;
    String valueColumn;
}
