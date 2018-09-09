package com.sample.webflux.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@NoArgsConstructor
@Data
public class Temperature implements Serializable {

    private String weather;

    private int temperature;
}
