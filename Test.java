import java.io.BufferedReader;

public class Test {

    public static void main(String[] args) {
        ObjectRepository objectRepository = new ObjectRepository();
        objectRepository.register(new Book());
        objectRepository.register(new Configurator());

        System.out.println(objectRepository.getObject("Book"));
        System.out.println(objectRepository.getObject("Book"));
        System.out.println(objectRepository.getObject("Book"));

        System.out.println(objectRepository.getObject("Configurator"));
        System.out.println(objectRepository.getObject("Configurator"));
        System.out.println(objectRepository.getObject("Configurator"));

    }
}
