package com.sparta.week02.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor

public class PersonRequestDto {
    private final String Name;
    private final Long phone;
}
