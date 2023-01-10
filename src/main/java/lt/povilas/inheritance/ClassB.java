package lt.povilas.inheritance;

public class ClassB extends ClassA {
    String variableB_A;
    String variableB_B;

    public ClassB(String variableB_A, String variableA_A) {
        super(variableA_A);
        this.variableB_A = variableB_A;
    }

    public void doSomethingB_A() {
        this.variableB_A = "eomfcspdc";
        this.variableB_B = "opmcc";
        variableA_A = "asdfa";
        variableA_B = "opfmopc";
        doSomethingA_A();
        doSomethingA_B();
    }

    public void doSomethingB_B() {

    }

    @Override
    public void doSomethingA_A() {
        super.doSomethingA_A();
    }

    @Override
    public void doSomethingA_B() {
        super.doSomethingA_B();
    }
}
