package insertpak;

import entity.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;


public class AccountTest {
    @Test
    public static void main(String[] args) {
        InputStream is = Test.class.getClassLoader().getResourceAsStream("conf/MyBatisConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        String statement = "mapper.AccountMapper.save";
        Account account = new Account(2L,"李四","123456",21);
        sqlSession.insert(statement,account);
        sqlSession.commit();
        sqlSession.close();
    }
}


