package mapped;

import com.google.common.collect.Lists;
import net.minecraft.util.Direction;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Class8553 extends Class8552<Direction> {
   private static String[] field38444;

   public Class8553(String var1, Collection<Direction> var2) {
      super(var1, Direction.class, var2);
   }

   public static Class8553 method30485(String var0, Predicate<Direction> var1) {
      return method30487(var0, Arrays.<Direction>stream(Direction.values()).filter(var1).collect(Collectors.<Direction>toList()));
   }

   public static Class8553 method30486(String var0, Direction... var1) {
      return method30487(var0, Lists.newArrayList(var1));
   }

   public static Class8553 method30487(String var0, Collection<Direction> var1) {
      return new Class8553(var0, var1);
   }
}
