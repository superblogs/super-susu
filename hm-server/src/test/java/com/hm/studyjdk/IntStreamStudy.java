package com.hm.studyjdk;

import org.junit.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamStudy {

    @Test
    public void intStreamRanger() {
        IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }


    @Test
    public void GouGu() {

        Stream<int[]> stream = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 1000)
                        .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                        .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
                );
        stream.forEach(t -> System.out.println("符合勾股定理的三角形有：" + t[0] + " " + t[1] + " " + t[2]));

    }


    @Test
    public void GouGuSuper_BecauseOnceMathSqrt() {
        IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .mapToObj(b -> new double[]{a, b, Math.sqrt(a * a + b * b)})
                        .filter(t -> t[2] % 1 == 0)
                ).forEach(t -> System.out.println("符合勾股定理的三角形有：" + t[0] + " " + t[1] + " " + t[2]));
    }

    @Test
    public void createStream() {
        Stream.iterate(0, i -> i + 2).limit(10).forEach(System.out::println);
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(20)
                .forEach(t -> System.out.println(t[0] + t[1]));
        Stream.generate(Math::random).limit(10).forEach(i-> System.out.println(i*100));
    }
}
