package OOP.main;

import OOP.basic.Pizza;


public class CheesePizza extends Pizza{

    public  String[] ingredients = {"Cheese", "Meat", "More Cheese", "Chilli"};

    @Override
    public void bake() {
        for (int i=0; i<ingredients.length; i++){
            System.out.print(ingredients[i] + ", ");
        }
        System.out.println();
    }

    @Override
    public void cut() {
        System.out.println("Pizza is cut");
    }

    @Override
    public void cut(Boolean required) {
        if(required.equals(true)){System.out.println("Pizza is cut");}
        else System.out.println("Don\'t need to cut");
    }

    @Override
    public void box() {
        System.out.println("Pizza is in the box");
    }

    @Override
    public void box(Boolean required) {
        if(required.equals(true)){System.out.println("Pizza is in the box");}
        else System.out.println("What's in the box?");
    }

    /**
     * default order
     */
    @Override
    public void prepare() {
        bake();
        cut();
        box();
    }

    /**
     * @param needToCut define whether Pizza need to be cut
     * @param needToBox define whether Pizza need to put in the box
     */
    @Override
    public void prepare(Boolean needToCut, Boolean needToBox) {
        bake();
        cut(needToCut);
        box(needToBox);
    }
}


