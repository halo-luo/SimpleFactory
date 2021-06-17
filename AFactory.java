package simpleFactory;

public class AFactory extends  Factory {
    public Fruit CreateFruit(){
        return new Apple();
    }
}
