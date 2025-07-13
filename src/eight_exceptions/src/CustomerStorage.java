package eight_exceptions.src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class CustomerStorage
{
    private final HashMap<String, Customer> storage;

    public CustomerStorage()
    {
        storage = new HashMap<>();
    }

    public void addCustomer(String data)
    {
        String[] components = data.split("\\s+");

        if(components.length != 4){
            throw new IllegalArgumentException("Wrong format. Correct format: add Василий Петров \" +\n" +
                    "            \"vasily.petrov@gmail.com +79215637722");
        }

        String name = components[0] + " " + components[1];
        storage.put(name, new Customer(name, components[3], components[2]));
        System.out.println(storage.toString());
    }

    public void listCustomers() throws IOException {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) throws Exception
    {
        if(storage.containsKey(name)){
            storage.remove(name);
        } else {
            throw new Exception("Нет такого пользователя");
        }

    }

    public int getCount()
    {
        return storage.size();
    }
}