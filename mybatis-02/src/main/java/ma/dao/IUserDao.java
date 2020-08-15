package ma.dao;

import ma.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public interface IUserDao {

    @Select("select * from user")
    List<User> getUsers();

    @Insert("insert into user (id,name,pwd) values (#{id},#{name},#{pwd})")
    int insertUser(User user);

    @Select("select * from User where id = #{id}")
    User getUserById(@Param("id") int id);

    @Update("update user set name=#{name}, pwd=#{pwd} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{id}")
    int deleteUserById(Long id);




}
