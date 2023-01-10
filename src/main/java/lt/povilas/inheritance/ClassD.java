package lt.povilas.inheritance;

public class ClassD extends ClassB {
    String variableD_A;
    String variableD_B;

    public ClassD(String variableB_A, String variableA_A) {
        super(variableB_A, variableA_A);

    }

    public void doSomethingD_A() {
        this.variableD_A = "";
        this.variableD_B = "";
        this.variableA_A = "";
        this.variableB_A = "";
        this.variableB_B = "";

    }

    public void doSomethingD_B() {

    }

}
