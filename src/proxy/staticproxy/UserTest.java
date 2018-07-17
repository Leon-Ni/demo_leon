package test1.p1;

public class UserTest {
	public static void main(String[] args) {
		//目标对象
        UserDao target = new UserDao();
        //代理对象,把目标对象传给代理对象,建立代理关系
        UserProxy proxy = new UserProxy(target);
        proxy.test();
	}
}
