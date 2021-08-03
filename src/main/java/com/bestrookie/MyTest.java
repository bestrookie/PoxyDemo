package com.bestrookie;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : bestrookie
 * @date : 12:50 2021/3/5
 */
public class MyTest {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("Ming", 38), new Person("Hong", 25), new Person("Bai", 43));
        list.stream().sorted((p1, p2) -> {
            return String.valueOf(p1.getAge()).compareTo(String.valueOf(p2.getAge()));
        });
        Map<Person, String> map = new HashMap<>();
        for (Person person : list) {
            map.put(person, person.getName());
        }
        System.out.println(map.get(new Person("Ming", 38)));

    }
}
