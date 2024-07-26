package app;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    DataRepository dataRepository = new DataRepository();
    Map<Integer, String> map = dataRepository.getData();

    public String getAll() {
        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(1);

        map.forEach((id, name) ->
                sb.append(String.format("%d) %d, %s%n", count.getAndIncrement(), id, name)));

        return "\nALL NAMES:\n" + sb;
    }

    public String getById(int id) {
        if (map.containsKey(id)) {
            return "NAME: id " + id + ", " +
                    map.get(id);
        } else return "No data!";
    }
}
