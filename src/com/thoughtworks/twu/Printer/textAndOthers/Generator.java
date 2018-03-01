package com.thoughtworks.twu.Printer.textAndOthers;

import java.util.Set;
import java.util.TreeSet;

public class Generator {


    public void findFactors (int n) {
        Set<Integer> factors = new TreeSet<>();
        int tempN = n;

        for (int i = 2; i <= n; i++) {
            if (tempN % i == 0) {
                factors.add(i);
                tempN = tempN / i;
            }
        }
        for (Integer factor: factors) {
            System.out.println(factor);

        }
    }

}
