package remapped;

import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class class_3455 implements class_2218 {
   private static String[] field_16939;
   private final Iterable<? extends class_2218> field_16940;

   public class_3455(Iterable<? extends class_2218> var1) {
      this.field_16940 = var1;
   }

   @Override
   public Predicate<class_2522> method_10251(class_8021<class_6414, class_2522> var1) {
      List var4 = Streams.stream(this.field_16940).<Predicate<class_2522>>map(var1x -> var1x.method_10251(var1)).collect(Collectors.toList());
      return var1x -> var4.stream().anyMatch(var1xx -> var1xx.test(var1x));
   }
}
