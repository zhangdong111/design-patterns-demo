package com.zhang.design.patterns.structural.decorator.demo2;

/**
 * @author Rexxar
 * @date 2021/7/22
 */
public class Client {

    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        component = new DecoratorA(component);
        component.opreation();
    }

}