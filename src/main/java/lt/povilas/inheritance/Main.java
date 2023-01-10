package lt.povilas.inheritance;

public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB01 = new ClassB();
        ClassB classB02 = new ClassB();
        ClassC classC = new ClassC();
        ClassD classD = new ClassD();

        classA.variableA_A = "";
        classA.doSomethingA_A();
        classB01.variableA_A = "sveiki";
        classB02.variableA_A = "sveiki";


        System.out.println(classB01.toString());
        System.out.println(classB01.equals(classB02));
        System.out.println(classB01.hashCode());


    }


}
