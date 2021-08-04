package com.sparta.week02.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor // 기본생성자를 대신 생성해줍니다.
@Entity // 테이블임을 나타냅니다.
public class Person extends Timestamped{
    @Id // ID 값, Primary Key로 사용하겠다는 뜻입니다.
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령입니다.
    private Long id;

    @Column(nullable = false) // 컬럼 값이고 반드시 값이 존재해야 함을 나타냅니다.
    private String Name;

    @Column(nullable = false)
    private Long phone;

    public Person(PersonRequestDto requestDto2){
        this.Name = requestDto2.getName();
        this.phone = requestDto2.getPhone();
    }

    public Person(String Name, Long phone) {
        this.Name = Name;
        this.phone = phone;
    }

    public void update(PersonRequestDto requestDto2) {
        this.Name = requestDto2.getName();
        this.phone = requestDto2.getPhone();
    }
}
