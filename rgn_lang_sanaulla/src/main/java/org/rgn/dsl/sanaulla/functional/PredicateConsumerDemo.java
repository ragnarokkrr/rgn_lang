package org.rgn.dsl.sanaulla.functional;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class PredicateConsumerDemo {
    public static Student updateStudentFee(Student student, Predicate<Student> predicate, Consumer<Student> consumer) {
        if (predicate.test(student)) {
            consumer.accept(student);
        }
        return student;
    }

}
