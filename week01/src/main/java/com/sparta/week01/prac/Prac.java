package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        String name = "kim";
        int bio = 3;

        Tutor tutor = new Tutor();
        tutor.setName(name);
        tutor.setBio(bio);
        System.out.println(tutor.getName());
        System.out.println(tutor.getBio());
    }
}
