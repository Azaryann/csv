import model.Customer;
import reader.CsvReader;
import reader.impl.CsvReaderImpl;
import writer.CsvWriter;
import writer.impl.CsvWriterImpl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        List<Customer> customers = new LinkedList<>();

        CsvReader csvReader = new CsvReaderImpl("C:/Users/User/Desktop/csvFile/customers.txt");
        customers = csvReader.read(Customer.class);
        System.out.println(customers);

        CsvWriter csvWriter = new CsvWriterImpl("C:/Users/User/Desktop/csvFile/customers.csv");
        csvWriter.write(customers);
        System.out.println(customers);
    }
}
