package ra;
//Khi lớp thực thi kế thừa từ lớp trừu tượng thì phải triển khai tất cả
//các phương thức trừu tươợng được khai báo trong lớp trừu tượng
public class Demo01 extends Abstract_Demo{
    @Override
    public void test1(int c, int d) {
        System.out.println("Triển khai phương thức trừu tượng test 01 của lớp cha");
    }

    @Override
    public void test2() {
        System.out.println("Triển khai phương thức trừu tượng test 02 của lớp cha");
    }
}
