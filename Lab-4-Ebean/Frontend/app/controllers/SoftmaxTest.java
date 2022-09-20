package controllers;

import java.util.Arrays;

public class SoftmaxTest {

    private static double softmax(double input, double[] neuronValues) {
        double total = Arrays.stream(neuronValues).map(Math::exp).sum();
        return Math.exp(input) / total;
    }

    public static void main(String[] args){
        double input = 4;
        double[] vector = new double[]{20.0, 95.0, 2.0, 95.0};
        double out;
        out = softmax(input,vector);
        System.out.println(out);
    }

}
