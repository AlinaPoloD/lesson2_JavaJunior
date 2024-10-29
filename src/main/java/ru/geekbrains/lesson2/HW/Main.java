package ru.geekbrains.lesson2.HW;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        /*Используя Reflection API, напишите программу, которая выводит на экран все методы класса String.*/
        Class<?> str = Class.forName("java.lang.String");
        Arrays.stream(str.getDeclaredMethods()).forEach(System.out::println);
    }
}

