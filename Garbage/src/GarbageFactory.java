/**
 * This class implements the factory design pattern
 */

public class GarbageFactory {
    public Garbage getItem(String item, String weight){
        if(item == null){
            return null;
        }
        if(item.equalsIgnoreCase("Dry")) {
            Garbage g= new Dry();
            ((Dry) g).selectWeight(weight);
            return g;
        }
        else if(item.equalsIgnoreCase("Wet")){
            Garbage g= new Wet();
            ((Wet) g).selectWeight(weight);
            return g;
        }
        else if(item.equalsIgnoreCase("Collection")) {
            Garbage g= new Collection();
            ((Collection) g).selectWeight(weight);
            return g;
        }
        return null;
    }
}
