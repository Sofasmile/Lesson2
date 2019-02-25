package builder_realize;

import java.util.ArrayList;

public class House {
    private ArrayList partsOfHouse = new ArrayList();

    protected void addPart(String part) {
        partsOfHouse.add(part);
    }

    public void showResult() {
        for (int i = 0; i < partsOfHouse.size(); i++) {
            System.out.println(partsOfHouse.get(i));
        }
    }
}
