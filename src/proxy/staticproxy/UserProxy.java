package test1.p1;

public class UserProxy implements IUserDao{

	 //接收保存目标对象
    private IUserDao target;
    //构造
    public UserProxy(IUserDao target){
        this.target=target;
    }
	@Override
	public void test() {
		System.out.println("123");
		target.test();//执行目标对象的方法
	}
}
