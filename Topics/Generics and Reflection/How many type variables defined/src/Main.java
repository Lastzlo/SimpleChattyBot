// Do not remove imports
import java.util.Scanner;

class TypeVariablesInspector {
    public void printTypeVariablesCount(TestClass obj, String methodName) throws Exception {
        // Add implementation here
        System.out.println(obj.getClass().getDeclaredMethod(methodName).getTypeParameters().length);
    }
}
