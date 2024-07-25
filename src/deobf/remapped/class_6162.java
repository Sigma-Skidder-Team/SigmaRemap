package remapped;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class class_6162 extends class_7360<Direction> {
   private static String[] field_31545;

   public class_6162(String var1, Collection<Direction> var2) {
      super(var1, Direction.class, var2);
   }

   public static class_6162 method_28250(String var0, Predicate<Direction> var1) {
      return method_28249(var0, Arrays.<Direction>stream(Direction.values()).filter(var1).collect(Collectors.<Direction>toList()));
   }

   public static class_6162 method_28251(String var0, Direction... var1) {
      return method_28249(var0, Lists.newArrayList(var1));
   }

   public static class_6162 method_28249(String var0, Collection<Direction> var1) {
      return new class_6162(var0, var1);
   }
}
