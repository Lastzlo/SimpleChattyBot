import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Class to work with
 */
class ComparatorInspector {

    /**
     * Return Type variable that corresponds to the type parameterizing Comparator.   
     *
     * @param clazz {@link Class} object, should be non null
     * @return {@link Type} object or null if Comparable does not have type parameter
     */
    public static <T> Type getComparatorType(Class clazz) {
        // Add implementation
    }

}