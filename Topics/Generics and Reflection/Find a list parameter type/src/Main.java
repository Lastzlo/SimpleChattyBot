// Do not remove imports
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;

class ListParameterInspector {
    // Do not change the method
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fieldName = scanner.next();

        ListParameterInspector inspector = new ListParameterInspector();
        inspector.printParameterType(new TestClass(), fieldName);
    }

    public void printParameterType(TestClass obj, String fieldName) throws Exception {
        // Add implementation here
        Field field = obj.getClass().getDeclaredField(fieldName);
        ParameterizedType parameterizedType = (ParameterizedType) field.getGenericType();

        Type rawType = parameterizedType.getRawType(); // interface java.util.Map
        Type[] argumentTypes = parameterizedType.getActualTypeArguments(); // class java.lang.String, class java.lang.Integer

        for(Type t : argumentTypes) {
            System.out.println(t.getTypeName());
        }
    }

//    public List<String> listField;
//
//    public static void main(String[] args) throws Exception {
////        Scanner scanner = new Scanner(System.in);
////        String fieldName = scanner.next();
//
//        ListParameterInspector inspector = new ListParameterInspector();
//        inspector.printParameterType(inspector, "listField");
//    }
//
//    public static void printParameterType(ListParameterInspector obj, String fieldName) throws Exception {
//        // Add implementation here
//        Field field = obj.getClass().getDeclaredField(fieldName);
//        System.out.println(field.toGenericString());
//
//        ParameterizedType parameterizedType = (ParameterizedType) field.getGenericType();
//
//        Type rawType = parameterizedType.getRawType(); // interface java.util.Map
//        Type[] argumentTypes = parameterizedType.getActualTypeArguments(); // class java.lang.String, class java.lang.Integer
//
//        for(Type t: argumentTypes) {
//            System.out.println(t.getTypeName());
//        }
//    }

}
