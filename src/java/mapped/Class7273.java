package mapped;

import net.minecraft.block.material.PushReaction;
import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class7273 {
   private static String[] field31198;
   public static final int[] field31199;
   public static final int[] field31200 = new int[PushReaction.values().length];

   static {
      try {
         field31200[PushReaction.field15864.ordinal()] = 1;
      } catch (NoSuchFieldError var11) {
      }

      try {
         field31200[PushReaction.field15863.ordinal()] = 2;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field31200[PushReaction.field15866.ordinal()] = 3;
      } catch (NoSuchFieldError var9) {
      }

      field31199 = new int[Direction.values().length];

      try {
         field31199[Direction.DOWN.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field31199[Direction.UP.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field31199[Direction.NORTH.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field31199[Direction.SOUTH.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field31199[Direction.WEST.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field31199[Direction.EAST.ordinal()] = 6;
      } catch (NoSuchFieldError var3) {
      }
   }
}
