package lt.povilas.inheritance;

import java.util.Objects;

public class ClassA {
    String variableA_A;
    String variableA_B;

    public void doSomethingA_A() {

    }

    public void doSomethingA_B() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassA classA = (ClassA) o;
        return Objects.equals(variableA_A, classA.variableA_A);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableA_A);
    }
}
