import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import  dao.UserMapper;
import util.GetSession;
public class UserMapperTest {
    @Test
    public void test(){
        SqlSession session = GetSession.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectUser(1);
        System.out.println(user.getName());
    }

}
