package com.hm.studyjdk;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class StreamStudy {
    private static List<Transaction> transactionList;

    static {
        transactionList = getTransactionList();
    }

    /**
     * find 2011
     * then sort by value
     */
    @Test
    public void demo1() {
        transactionList.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList())
                .forEach(i -> System.out.println(i.toString()));
    }

    /**
     * where the trader form collage
     */
    @Test
    public void findTraderWhereFrom() {
        transactionList.stream().map(i -> i.getTrade().getCity())
                .distinct()
                .forEach(System.out::println);
    }

    /**
     * find the trader where from TYUT
     * && sort by name
     */
    @Test
    public void sortByTraderWhereFromTYUT() {
        transactionList.stream().map(Transaction::getTrade)
                .filter(i -> i.getCity().equals("太原理工大学"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
    }

    @Test
    public void findTheTraderNameAndSorted() {
        String collect = transactionList.stream().map(transaction -> transaction.getTrade().getName())
                .distinct()
                .sorted(Comparator.comparing(String::toString))
                .collect(joining());
        System.out.println(collect);
        String collect1 = "huwenjianjiaozhijunliujingmalongsunzhongshi";
        Assert.assertEquals(collect, collect1);
    }

    @Test
    public void findIfTraderFromTYUT() {
        boolean b = transactionList.parallelStream().anyMatch(transaction -> transaction.getTrade().getCity().equals("太原理工大学"));
        System.out.println("有太原理工大学上班的交易员" + b);
    }

    @Test
    public void addTheTransactionValueWhereTraderInTYUT() {
        int sum = transactionList.parallelStream().filter(i -> i.getTrade().getCity().equals("太原理工大学"))
                .mapToInt(Transaction::getValue)
                .sum();

        System.out.println(sum);
    }

    /**
     * MapToInt 省去int计算的装箱操作
     */
    @Test
    public void sumAndTestMapToInt() {
        int sum = transactionList.parallelStream()
                .filter(transaction -> transaction.getTrade().getCity().equals("太原理工大学"))
                .mapToInt(Transaction::getValue)
                .sum();
        System.out.println(sum);
        Assert.assertEquals(14200, 14200);
    }


    @Test
    public void maxValue() {
        Optional<Integer> maxValue = transactionList.parallelStream().map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println("Max" + maxValue);
        Optional<Integer> min = transactionList.parallelStream().map(Transaction::getValue)
                .reduce(Integer::min);
        System.out.printf("Min: %d%n", min.get());
    }


    @Test
    public void testBoxed() {
        OptionalInt max = transactionList.parallelStream()
                .mapToInt(Transaction::getValue)
                .max();
        int i = max.orElse(1);
        System.out.println(i);
        Assert.assertEquals(10000,i);
    }

    @Test
    public void testTheStreamSec() {
        transactionList.forEach(System.out::println);
        System.out.println("============");
        transactionList.parallelStream().forEach(System.out::println);
        System.out.println("---");
        transactionList.parallelStream().forEach(System.out::println);
    }


    private static List<Transaction> getTransactionList() {
        Trader malong = new Trader("malong", "哈佛大学");
        Trader sunzhongshi = new Trader("sunzhongshi", "天津大学");
        Trader jiaozhijun = new Trader("jiaozhijun", "河南大学");
        Trader huwenjian = new Trader("huwenjian", "太原理工大学");
        Trader liujing = new Trader("liujing", "太原理工大学");
        return Arrays.asList(
                new Transaction(malong, 2011, 300),
                new Transaction(malong, 2012, 1000),
                new Transaction(sunzhongshi, 2011, 3210),
                new Transaction(jiaozhijun, 2011, 500),
                new Transaction(huwenjian, 2015, 3000),
                new Transaction(huwenjian, 2016, 10000),
                new Transaction(liujing, 2017, 1200)
        );
    }
}

class Trader {
    private final String name;
    private final String city;


    Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}

class Transaction {
    private final Trader trade;
    private final int year;
    private final int value;

    Transaction(Trader trader, int year, int value) {
        this.trade = trader;
        this.value = value;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trade=" + trade +
                ", year=" + year +
                ", value=" + value +
                '}';
    }

    public Trader getTrade() {
        return trade;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }
}