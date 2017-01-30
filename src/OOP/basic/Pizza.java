package OOP.basic;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    public  String[] ingredients;

    public  abstract void bake();

    public abstract void cut();

    public abstract void cut(Boolean required);

    public abstract void box();

    public abstract void box(Boolean required);

    public abstract void prepare();

    public abstract void prepare(Boolean needToCut, Boolean needToBox);
}
