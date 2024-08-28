package mapped;

import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Class7563 implements Class7562 {
   private static String[] field32490;
   private final Iterable<? extends Class7562> field32491;

   public Class7563(Iterable<? extends Class7562> var1) {
      this.field32491 = var1;
   }

   @Override
   public Predicate<Class7380> method24750(Class9348<Class3209, Class7380> var1) {
      List<Predicate<Class7380>> var4 = Streams.stream(this.field32491).<Predicate<Class7380>>map(var1x -> var1x.method24750(var1)).collect(Collectors.toList());
      return var1x -> var4.stream().allMatch(var1xx -> var1xx.test(var1x));
   }
}
