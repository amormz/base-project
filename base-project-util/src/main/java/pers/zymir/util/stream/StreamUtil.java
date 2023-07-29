package pers.zymir.util.stream;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class StreamUtil {
  public static <T> List<T> nonNull(Collection<T> collection) {
    return collection.stream().filter(Objects::nonNull).toList();
  }

  public static <T, R> List<R> mapTo(Collection<T> collection, Function<T, R> function) {
    return collection.stream().map(function).toList();
  }
}
