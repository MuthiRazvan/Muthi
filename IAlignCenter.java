package sp1;

public class IAlignCenter implements IAlignStrategy {
    @Override
    public void Print(String text) {
        System.out.println("+++++"+text+"+++++");
    }
}
