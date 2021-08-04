package com.sparta.week02.controller;

import com.sparta.week02.domain.*;
import com.sparta.week02.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {

    private final PersonRepository personRepository;

    private final PersonService personService;

    // PostMapping을 통해서, 같은 주소라도 방식이 다름을 구분합니다.
    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto2) {
        // requestDto 는, 생성 요청을 의미합니다.
        // 강의 정보를 만들기 위해서는 강의 제목과 튜터 이름이 필요하잖아요?
        // 그 정보를 가져오는 녀석입니다.

        // 저장하는 것은 Dto가 아니라 Course이니, Dto의 정보를 course에 담아야 합니다.
        // 잠시 뒤 새로운 생성자를 만듭니다.
        Person person = new Person(requestDto2);

        // JPA를 이용하여 DB에 저장하고, 그 결과를 반환합니다.
        return personRepository.save(person);
    }

    @PutMapping("/api/persons/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto2) {
        return personService.update(id, requestDto2);
    }

    @DeleteMapping("/api/persons/{id}")
    public Long deletePerson(@PathVariable Long id) {
        personRepository.deleteById(id);
        return id;
    }

    @GetMapping("/api/persons")
    public List<Person> getPersons() {
        return personRepository.findAll();
    }
}
