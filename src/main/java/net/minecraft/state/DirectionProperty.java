package net.minecraft.state;

import com.google.common.collect.Lists;
import net.minecraft.util.Direction;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DirectionProperty extends EnumProperty<Direction> {
   private static String[] field38444;

   public DirectionProperty(String var1, Collection<Direction> var2) {
      super(var1, Direction.class, var2);
   }

   public static DirectionProperty create(String var0, Predicate<Direction> var1) {
      return method30487(var0, Arrays.<Direction>stream(Direction.values()).filter(var1).collect(Collectors.<Direction>toList()));
   }

   public static DirectionProperty method30486(String var0, Direction... var1) {
      return method30487(var0, Lists.newArrayList(var1));
   }

   public static DirectionProperty method30487(String var0, Collection<Direction> var1) {
      return new DirectionProperty(var0, var1);
   }
}
