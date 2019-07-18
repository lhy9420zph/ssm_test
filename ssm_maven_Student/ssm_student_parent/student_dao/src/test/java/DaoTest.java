import com.itheima.dao.StudentDao;
import com.itheima.domain.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-13 18:18
 **/
public class DaoTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-studentDao.xml");
        StudentDao studentDao = applicationContext.getBean(StudentDao.class);
        Student student = new Student();
        student.setId(2);
        student.setName("李四");
        student.setSex(0);
        student.setAge(16);
        student.setAddress("郑州");
        //studentDao.updateStudent(student);
       /* Student s1 = new Student();
        s1.setName("林青霞");
        s1.setSex(1);
        s1.setAge(18);
        s1.setAddress("河南");
        studentDao.addStudent(s1);*/
       Integer[] ids = {};
        List<Student> students = studentDao.findStudentById(ids);
        for (Student student1 : students) {
            System.out.println(student1);
        }
    }
}
