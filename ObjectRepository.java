import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ObjectRepository {
    protected HashMap<String, ObjectType> hashMap;
    private Configurator configurator;

    public ObjectRepository() {
        this.hashMap = new HashMap<>();
        this.configurator = new Configurator();
    }

    public void register(Object object) {
        this.hashMap.put(object.getClass().getName(), object.getClass().getDeclaredAnnotation(CreationType.class).type());
    }

    public DataBean getObject(String product) {
        ObjectType value = hashMap.get(product);
        if(value == ObjectType.PROTOTYPE) {
            return new Book();
        }
        if(value == ObjectType.SINGLETON){
            return configurator;
        }

        return null;
    }

}
