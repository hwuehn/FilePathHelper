package data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListTool {

    public static <T> List<T> invertUsingStreams(List<T> list) {

        return IntStream.rangeClosed(1, list.size())
                .mapToObj(i -> list.get(list.size() - i))
                .collect(Collectors.toList());

    }
}

