package com.example.dmitrii.spring_practice.gemini;

import com.example.dmitrii.spring_practice.rocket_interfaces.FuelType;

import static com.example.dmitrii.spring_practice.ansi_colors.Colors.ANSI_BLUE;

public class GeminiFuelType implements FuelType {

    @Override
    public void fuelingRocket() {
        System.out.println(ANSI_BLUE+"Gemini was fueled with LH+LOX");
    }
}
