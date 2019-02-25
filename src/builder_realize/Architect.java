package builder_realize;

public class Architect {
    private Builder builder;
    public Architect(Builder builder){
        this.builder = builder;
    }
    public void buil(){
        builder.buildFoundation();
        builder.buildWall();
        builder.buildRoof();
    }
}
