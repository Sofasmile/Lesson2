package builder_realize;

public class Employee extends Builder {
    private House house = new House();

    @Override
    public void buildFoundation() {
        house.addPart("Foundation");
    }

    @Override
    public void buildWall() {
        house.addPart("Wall");
    }

    @Override
    public void buildRoof() {
        house.addPart("Roof");
    }
    @Override
    public House result(){
        return house;
    }
}
