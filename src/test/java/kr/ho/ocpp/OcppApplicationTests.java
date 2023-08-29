package kr.ho.ocpp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Method;
import java.util.Arrays;

@SpringBootTest
class OcppApplicationTests {

	@Test
	void contextLoads() {

		Class<?> clazz = Class.forName("com.example.MyClass");

		// 클래스의 생성자를 가져옴
		// 여기서는 파라미터가 없는 기본 생성자를 사용하도록 가정합니다.
		Object obj = clazz.getDeclaredConstructor().newInstance();

		// 클래스의 메소드를 가져옴
		Method method = clazz.getDeclaredMethod("myMethod", String.class);


		var test = clazz.getDeclaredClasses();

		var a = Arrays.stream(test).toList();

		String ab = "";
		java.util.Optional.ofNullable(ab).orElseThrow(ChangeSetPersister.NotFoundException::new);

		//  System.out.println("a = " + a);
		// 메소드를 호출
		method.invoke(obj, "Hello, Reflection!");
	}

}
