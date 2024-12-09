package util;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

public class GetSession {
    private static SqlSessionFactory factory;
    static{
        try{
            String url = "mybatis-config.xml";
            InputStream stream = Resources.getResourceAsStream(url);
            factory = new SqlSessionFactoryBuilder().build(stream);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        return factory.openSession();
    }

}
