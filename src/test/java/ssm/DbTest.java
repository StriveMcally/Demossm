package ssm;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mcally.dao.UserMapper;

public class DbTest {

	@Before	
public  void GetField() {
	
}	

	@Test
	public void test1() {
		ApplicationContext ctx=new  ClassPathXmlApplicationContext(new String[]{"conf/spring-mvc.xml","conf/spring-mybatis.xml"});
		UserMapper  userMapper=(UserMapper) ctx.getBean("userMapper");
		
		
		System.out.print(userMapper);
		
		
	}
	
	

}
