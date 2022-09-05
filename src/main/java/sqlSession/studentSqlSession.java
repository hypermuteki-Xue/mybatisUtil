package sqlSession;

import POJO.student;
import mappers.studentMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class studentSqlSession {
    static studentMapper studentMapper=null;
    static SqlSession sqlSession=null;
    static SqlSessionFactory sqlSessionFactory=null;
    static  {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession=sqlSessionFactory.openSession();
        studentMapper=sqlSession.getMapper(mappers.studentMapper.class);
    }
   public List<student> selectAll()
    {
        return studentMapper.selectAll();
    }
    public List<student> selectByid(String id)
    {
        return studentMapper.selectById(id);
    }
   public List<student> selectAgeAndId( String age, String id){return studentMapper.selectAgeAndId(age,id);}
   public List<student> selectLikeClass( String className){return studentMapper.selectLikeClass(className);}
}
