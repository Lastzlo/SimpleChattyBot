import java.util.ArrayList;
import java.util.List;

/**
 * Class to work with
 */
class Violator {

    public static List<Box<? extends Bakery>> defraud() {

        List boxList = new ArrayList<>();

        Box<Paper> paperBox = new Box<>();
        paperBox.put(new Paper());
        boxList.add(paperBox);


        // Add implementation here
        return boxList;
    }

}

