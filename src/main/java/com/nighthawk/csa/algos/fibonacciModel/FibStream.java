package com.nighthawk.csa.algos.fibonacciModel;

import java.util.stream.Stream;

public class FibStream extends _Fibonacci {
    public FibStream(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
            .limit(super.size)
            .forEach(f -> super.setData(f[0]) );
    }

    public static void main(String[] args) {
        int num = 20;   //number of Fibs, 92 is max for long
        _Fibonacci fibonacci = new FibStream(num);
        fibonacci.print("Stream");
    }
}
