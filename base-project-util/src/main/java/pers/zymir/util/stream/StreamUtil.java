package pers.zymir.util.stream;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamUtil {
  public static <T> List<T> nonNull(Collection<T> collection) {
    return collection.stream().filter(Objects::nonNull).toList();
  }

  public static <T, R> List<R> mapTo(Collection<T> collection, Function<T, R> function) {
    return collection.stream().map(function).toList();
  }

  public static <T> List<T> filter(Collection<T> collection, Predicate<T> predicate) {
    return collection.stream().filter(predicate).toList();
  }

  public static <T> List<T> foreachPeek(Collection<T> collection, Consumer<T> consumer) {
    collection.forEach(consumer);
    return collection.stream().toList();
  }
}
