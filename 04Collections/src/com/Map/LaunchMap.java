package com.Map;

import java.util.Map;

public class LaunchMap {
    public static void main(String[] args) {
        Map<Character,Integer> map = Map.of('I', 1, 'V', 5,'X',3, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        System.out.println(map);
    }
    
}
