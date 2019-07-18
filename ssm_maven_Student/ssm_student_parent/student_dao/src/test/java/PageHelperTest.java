import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.dao.StudentDao;
import com.itheima.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @program: ssm_maven_Student
 * @description
 * @author: lianghaoyang
 * @create: 2019-07-14 11:49
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-studentDao.xml")
public class PageHelperTest {
    @Autowired
    private StudentDao studentDao;
    @Test
    public void testPageHelper(){
        //设置分页参数
        PageHelper.startPage(1,3);
        PageInfo<Student> studentPageInfo = new PageInfo<Student>(studentDao.findAll());
        List<Student> list = studentPageInfo.getList();
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
