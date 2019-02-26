package builder_realize;

public abstract class Builder {
    public abstract void buildFoundation();

    public abstract void buildWall();

    public abstract void buildRoof();

    public abstract House result();
}
