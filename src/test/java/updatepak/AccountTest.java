package updatepak;

import entity.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import repository.AccountRepository;

import java.io.InputStream;
import java.util.List;


public class AccountTest {
    @Test
    public static void main(String[] args) {
        InputStream is = Test.class.getClassLoader().getResourceAsStream("conf/MyBatisConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);

        Account account = accountRepository.findById(1L);
        System.out.println(account);
        account.setUsername("小明");
        account.setPassword("000000");
        account.setAge(50);
        int update = accountRepository.update(account);
        System.out.println(update);
        sqlSession.commit();
        sqlSession.close();
    }
}


