package org.example;

import java.util.*;

public class RootsCalculator {

    public static List<Double> calculate_roots(double a, double b, double c) {
        List<Double> roots = new ArrayList<>();
        double inf = Double.POSITIVE_INFINITY;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    roots.add(inf);
                }
            } else {
                roots.add(-b / c);
            }
        } else {
            double del = (b * b - 4 * a * c);
            if (del == 0) {
                roots.add((-b / (2 * a)));
            } else if (del > 0) {
                roots.add((-b - del) / (2 * a));
                roots.add((-b - del) / (2 * a));
            }
        }

        return roots;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter a => ");
        double a = sr.nextDouble();
        System.out.print("\nEnter b => ");
        double b = sr.nextDouble();
        System.out.print("\nEnter c => ");
        double c = sr.nextDouble();
        calculate_roots(a, b, c);
        sr.close();
    }
}
