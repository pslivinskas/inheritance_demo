package lt.povilas.inheritance;

public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA("wecop");
        ClassB classB01 = new ClassB("wepofj", "weijfqw");
        ClassB classB02 = new ClassB("wefpoj", "weokoqwkd");
        ClassC classC = new ClassC("lwpemd", "iweod");
        ClassD classD = new ClassD("owdvj", "wpeofjwq");

        classA.variableA_A = "";
        classA.doSomethingA_A();

        classB01.variableA_A = "sveiki";
        classB02.variableA_A = "sveiki";
        classB01.variableA_B = "sveiki01";
        classB02.variableA_B = "sveiki01";


        System.out.println(classB01.toString());
        System.out.println(classB01.equals(classB02));
        System.out.println(classB01.hashCode());


    }


}
