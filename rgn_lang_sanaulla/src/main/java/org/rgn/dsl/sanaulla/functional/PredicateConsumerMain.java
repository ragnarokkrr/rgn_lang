package org.rgn.dsl.sanaulla.functional;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class PredicateConsumerMain {
    public static void main(String[] args) {
        Student student1 = new Student("Ashok", "Kumar", 9.5);
        student1 = PredicateConsumerDemo.updateStudentFee(
          student1,
          student -> student.grade > 8.5,
          student -> student.feeDiscount = 40.0
        );
        student1.printFee();
    }


}
