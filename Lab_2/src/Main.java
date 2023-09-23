import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        TestClass obj = new TestClass();
        Class<?> clazz = obj.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Repeat.class)) {
                int times = method.getAnnotation(Repeat.class).times();
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }

                for (int i = 0; i < times; i++) {
                    try {
                        // Check method parameter types and provide appropriate arguments
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        Object[] arguments = new Object[parameterTypes.length];
                        for (int j = 0; j < parameterTypes.length; j++) {
                            if (parameterTypes[j] == String.class) {
                                arguments[j] = "example";
                            } else if (parameterTypes[j] == int.class) {
                                arguments[j] = 42;
                            } else if (parameterTypes[j] == double.class) {
                                arguments[j] = 42.5;
                            } else if (parameterTypes[j] == boolean.class) {
                                arguments[j] = true;
                            }
                        }

                        method.invoke(obj, arguments);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        System.out.println(e.getMessage());
                    }
                }

            }
        }
    }
}
