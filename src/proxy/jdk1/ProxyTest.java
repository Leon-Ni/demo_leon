package proxy.jdk1;
/**
 * 测试类
 */
public class ProxyTest {
    public static void main(String[] args) {
        // 目标对象
        IUserDao target = new UserDao();

        // 原始的类型 class 
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyJdK(target).getProxyInstance();
       
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());
        
        // 执行方法   【代理对象】
        proxy.test();
    }
}