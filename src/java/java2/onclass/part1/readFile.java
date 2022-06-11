package java2.onclass.part1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class readFile {
    public void getCustomer() throws IOException {
        List<Employee1> employees;
        Gson gson = new Gson();

            FileReader reader = new FileReader("employee.json");
            employees = gson.fromJson(reader,new TypeToken<List<Employee1>>(){}.getType());
            for (Employee1 c : employees){
                System.out.println(c);
            }
            reader.close();
    }
}
