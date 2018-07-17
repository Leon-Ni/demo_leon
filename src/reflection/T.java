package reflection;

import org.junit.Test;

public class T {

	@Test
	public void t() throws NoSuchFieldException, SecurityException {
		Class clazz = Person.class;
		System.out.println(clazz.getField("name"));
		try {
			Person person = (Person) clazz.newInstance();
			person.p1();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
