package com.chtuqu.hfdp.ch7_adapter.ducks;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says:");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says:");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says:");
        testDuck(adapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
