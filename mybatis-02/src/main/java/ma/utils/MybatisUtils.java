package ma.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
// mybatis的工具类，首先要获取我们的sqlSession 对象，
    // 要获取sqlSession先要获取sqlSessionFactory
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    // 参考官方文档，获取SqlSessionFactory
    static {
        try {
            String resource = "mybatis-config.xml"; // 一般我们将文件放在resource 目录下
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 获取sqlSession对象
    public static SqlSession getSqlSession() {
        // 扩大sqlSessionFactroy的作用域
        // 获取sqlSession,默认手动提交事务,设置为true后自动提交事物
        return sqlSessionFactory.openSession(true);
    }
}
