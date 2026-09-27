package com.Java8;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    static void main() {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        for (int n : nums){
            System.out.println(n);
        }

        //Stream
        nums.stream().forEach(n -> System.out.println(n));


        //filter
        nums.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

        //map
        nums.stream().map(n -> n * 2).forEach(n -> System.out.println(n));

        System.out.println();

        //chaining
        nums.stream().filter(n -> n % 2 != 0).map(n -> n * 10).forEach(n -> System.out.println(n));

//        System.out.println(nums);

        long count = nums.stream().filter(n -> n % 2 == 0).count();

        System.out.println(count);

    }
}
