// do not remove imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define hasNull method here
	static <U> boolean hasNull(U[] array) {
		for(U u: array) {
			if (u == null) return true;
		}
		return false;
	}
}
