package selectpak;

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
//        List<Account> repositoryAll = accountRepository.findAll();
//        for (Account account : repositoryAll){
//            System.out.println(account);
//        }
        Account byId = accountRepository.findById(2L);
        System.out.println(byId);

    }
}


