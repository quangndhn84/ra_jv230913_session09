package ra;

public abstract class Abstract_Demo {
    //Attributes
    private int a;
    private String b;

    public Abstract_Demo() {
    }

    public Abstract_Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }

    //Implement method
    public int add(int number1, int number2) {
        //block implement
        return number1 + number2;
    }

    public void test() {
        //block implement
        System.out.println("Hello world");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    //Abtract Method
    //Access Modifier + abstract + returnData + methodName(params);
    public abstract void test1(int c, int d);
    public abstract void test2();
}
