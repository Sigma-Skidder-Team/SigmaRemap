package remapped;

import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class class_6790 implements class_2218 {
   private static String[] field_35013;
   private final Iterable<? extends class_2218> field_35012;

   public class_6790(Iterable<? extends class_2218> var1) {
      this.field_35012 = var1;
   }

   @Override
   public Predicate<class_2522> method_10251(class_8021<class_6414, class_2522> var1) {
      List var4 = Streams.stream(this.field_35012).<Predicate<class_2522>>map(var1x -> var1x.method_10251(var1)).collect(Collectors.toList());
      return var1x -> var4.stream().allMatch(var1xx -> var1xx.test(var1x));
   }
}
