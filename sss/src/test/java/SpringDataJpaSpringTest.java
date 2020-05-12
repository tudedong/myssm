import com.tdd.edu.pojo.Resume;
import com.tdd.edu.service.ResumeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author tudedong
 * @description
 * @date 2020-05-06 23:06:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:application*.xml"})
public class SpringDataJpaSpringTest {

    //希望测试ioc容器中的哪个对象你注入即可。
    @Autowired
    private ResumeService resumeService;

    @Test
    public void testSpringDataJpaSpring(){

        List<Resume> resumeList = resumeService.findAll();
        for(Resume resume:resumeList){
            System.out.println(resume);
        }

    }
}
