public class TestProxy {
	
	public static void main(String[] args) {
		
		IUserService userService = new UserService();
		System.out.println(userService.getClass());
		
		ProxyJdk jdk = new ProxyJdk(userService);
		
		IUserService proxy = (IUserService) jdk.getProxyInstance();
		System.out.println(proxy.getClass());
		
		proxy.add();
		
	}

}
