package remapped;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class class_4438 {
   private static final Map<class_4639, class_2366<?>> field_21654 = Maps.newHashMap();

   public static <T> class_2366<T> method_20597(class_4639 var0, Function<class_6437, class_9349<T>> var1) {
      class_2366 var4 = new class_2366(var1);
      class_2366 var5 = field_21654.putIfAbsent(var0, var4);
      if (var5 == null) {
         return var4;
      } else {
         throw new IllegalStateException("Duplicate entry for static tag collection: " + var0);
      }
   }

   public static void method_20598(class_6437 var0) {
      field_21654.values().forEach(var1 -> var1.method_10840(var0));
   }

   public static void method_20596() {
      field_21654.values().forEach(class_2366::method_10844);
   }

   public static Multimap<class_4639, class_4639> method_20601(class_6437 var0) {
      HashMultimap var3 = HashMultimap.create();
      field_21654.forEach((var2, var3x) -> var3.putAll(var2, var3x.method_10841(var0)));
      return var3;
   }

   public static void method_20599() {
      class_2366[] var2 = new class_2366[]{class_2351.field_11742, class_391.field_1612, class_6503.field_33093, class_5218.field_26791};
      boolean var3 = Stream.<class_2366>of(var2).anyMatch(var0 -> !field_21654.containsValue(var0));
      if (var3) {
         throw new IllegalStateException("Missing helper registrations");
      }
   }
}
