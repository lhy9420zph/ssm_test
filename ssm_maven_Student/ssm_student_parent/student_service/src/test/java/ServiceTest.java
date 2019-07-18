import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-13 20:49
 **/
public class ServiceTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-studentService.xml");
        StudentService studentService = applicationContext.getBean(StudentService.class);
        //设置分页参数
//        PageHelper.startPage(1, 3);
//        PageInfo<Student> studentPageInfo = new PageInfo<Student>(studentService.findAll());
//        List<Student> list = studentPageInfo.getList();
//        for (Student student : list) {
//            System.out.println(student);
//        }
    }
}
