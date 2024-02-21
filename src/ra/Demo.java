package ra;

public class Demo {
    public static void main(String[] args) {
        //Khởi tạo đối tượng trực tiếp từ constructor của lớp
        Demo01 d1 = new Demo01();
        //Khởi tạo đối tượng gián tiếp
        Abstract_Demo ad = new Abstract_Demo() {
            @Override
            public void test1(int c, int d) {

            }

            @Override
            public void test2() {

            }
        };
        ad.getA();
        Abstract_Demo ad2 = new Demo01();
    }

}
