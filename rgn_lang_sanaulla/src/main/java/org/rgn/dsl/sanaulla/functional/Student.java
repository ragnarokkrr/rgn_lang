package org.rgn.dsl.sanaulla.functional;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class Student {
    String firstName;
    String lastName;
    Double grade;
    Double feeDiscount = 0.0;
    Double baseFee = 20000.0;

    public Student(String firstName, String lastName, Double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public void printFee() {
        Double newFee = baseFee - ((baseFee * feeDiscount) / 100);
        System.out.println("The Fee after discount: " + newFee);
    }
}
