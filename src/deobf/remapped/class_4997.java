package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class class_4997<T> {
   private static String[] field_25857;
   private final List<T> field_25856 = Lists.newArrayList();
   private final Spliterator<T> field_25855;

   public class_4997(Stream<T> var1) {
      this.field_25855 = var1.spliterator();
   }

   public Stream<T> method_23007() {
      return StreamSupport.<T>stream(new class_3826(this, Long.MAX_VALUE, 0), false);
   }
}
