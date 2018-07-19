package proxy.staticproxy;


public class UserDao implements IUserDao {

	@Override
	public void test() {
		System.out.println("实现接口");
	}

}
