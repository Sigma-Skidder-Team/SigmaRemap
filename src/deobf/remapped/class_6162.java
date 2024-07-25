package remapped;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class class_6162 extends class_7360<class_240> {
   private static String[] field_31545;

   public class_6162(String var1, Collection<class_240> var2) {
      super(var1, class_240.class, var2);
   }

   public static class_6162 method_28250(String var0, Predicate<class_240> var1) {
      return method_28249(var0, Arrays.<class_240>stream(class_240.values()).filter(var1).collect(Collectors.<class_240>toList()));
   }

   public static class_6162 method_28251(String var0, class_240... var1) {
      return method_28249(var0, Lists.newArrayList(var1));
   }

   public static class_6162 method_28249(String var0, Collection<class_240> var1) {
      return new class_6162(var0, var1);
   }
}
