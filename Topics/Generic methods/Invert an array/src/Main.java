// do not remove imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define invert method here
	static <T> T[] invert(T[] array) {
		for (int i = 0, j = array.length - 1;  i < (array.length) / 2; i++, j--) {
			T buff = array[i];
			array[i] = array[j];
			array[j] = buff;
		}
		return array;
	}
}
