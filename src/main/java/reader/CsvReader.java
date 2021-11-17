package reader;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface CsvReader {

    <T> List<T> read(Class<T> type) throws NoSuchFieldException,
            InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException;
}
