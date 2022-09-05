import POJO.student;
import mappers.studentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import sqlSession.studentSqlSession;
import sun.util.logging.resources.logging;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class mybatisTest {
       @Test
       public void test() throws IOException {
           studentSqlSession studentSqlSession=new studentSqlSession();
         List<student> students= studentSqlSession.selectLikeClass("B");
              System.out.println(students);
       }
}
