package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("SV001","Nguyễn Văn A",22);
        Student student2 = new Student("SV002","Nguyễn Văn C",20);
        Student student3 = new Student("SV003","Nguyễn Văn B",25);
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        //In thông tin sinh viên trước khi sắp xếp
        System.out.println("THÔNG TIN SINH VIÊN TRƯỚC SẮP XẾP");
        listStudent.forEach(student -> System.out.println(student));
        //1. Sắp xếp sinh viên theo tuổi tăng dần sử dụng Comparable Interface
        System.out.println("THÔNG TIN SINH VIÊN SẮP XẾP VỚI COMPARABLE");
        Collections.sort(listStudent);
        listStudent.forEach(student -> System.out.println(student));

        //2. Sắp xếp sinh viên với Comparator Interface
        //2.1. Sắp xếp theo mã giảm dần
        Collections.sort(listStudent, new Comparator<Student>() {
                    @Override
                    public int compare(Student student, Student t1) {
                        return -student.getStudentId().compareTo(t1.getStudentId());
                    }
                });
        System.out.println("SẮP XẾP COMPARATOR VỚI MÃ GIẢM DẦN: ");
        listStudent.forEach(student -> System.out.println(student));
        //2.2. Sắp xếp theo tên tăng dần
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getStudentName().compareTo(t1.getStudentName());
            }
        });
        System.out.println("SẮP XẾP COMPARATOR VỚI TÊN TĂNG DẦN: ");
        listStudent.forEach(student -> System.out.println(student));
    }
}
