package proxy.jdk2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyJdk {

	Object target;

	public ProxyJdk(Object target) {
		this.target = target;
	}

	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("代理前方法");
						Object returnValue = method.invoke(target, args);
						System.out.println("代理后方法");
						return returnValue;
					}
				});
	}

}
