package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import mapped.Class8179;

public class Class8544<T> {
   private static String[] field38408;
   private final List<T> field38409 = Lists.newArrayList();
   private final Spliterator<T> field38410;

   public Class8544(Stream<T> stream) {
      this.field38410 = stream.spliterator();
   }

   public Stream<T> method30440() {
      return StreamSupport.stream(new Class8179(this, Long.MAX_VALUE, 0), false);
   }

   public static List method30441(Class8544 class8544) {
      return class8544.field38409;
   }

   public static Spliterator method30442(Class8544 class8544) {
      return class8544.field38410;
   }
}
