package com.bertha.Gendra.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBase {
    private String Response;
    private Integer ResponseCode;
}
