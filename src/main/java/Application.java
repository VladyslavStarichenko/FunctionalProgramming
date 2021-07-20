import utils.Functionality;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        Functionality functionality = new Functionality();
        try {
            functionality.printInterest(functionality.getGenderDistributionList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
