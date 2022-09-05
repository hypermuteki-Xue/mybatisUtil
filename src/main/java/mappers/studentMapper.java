package mappers;

import POJO.student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface studentMapper {
       List<student> selectAll();
       List<student> selectById(@Param("id") String id);

       List<student> selectLikeName(@Param("stuName") String stuName);
       List<student> selectLikeClass(@Param("className") String className);

       List<student> selectAgeAndId(@Param("age") String age,@Param("id") String id);
}
