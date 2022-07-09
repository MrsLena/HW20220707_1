package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //Дана Map<String, String>, если в ней есть ключ ‘a’ и ‘b’, то нужно
        //создать новый ключ ‘ab’ с суммой значений от ключей a и b.

        Map<String, String> map = new HashMap<>();
        map.put("a", "za");
        map.put("b", "zb");
        map.put("c", "zc");
        map.put("e", "ze");



        String poiskA = map.get("a");
        String poiskB = map.get("b");
        if (poiskA!="null" || poiskB!="null") {
            map.put("ab", poiskA+poiskB);
        }

        System.out.println(map);

    }
}