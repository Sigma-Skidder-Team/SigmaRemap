package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class8024 {
   private static String[] field34485;
   public static final int[] field34486;
   public static final int[] field34487 = new int[Direction.values().length];

   static {
      try {
         field34487[Direction.EAST.ordinal()] = 1;
      } catch (NoSuchFieldError var11) {
      }

      try {
         field34487[Direction.WEST.ordinal()] = 2;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field34487[Direction.field673.ordinal()] = 3;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field34487[Direction.DOWN.ordinal()] = 4;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field34487[Direction.SOUTH.ordinal()] = 5;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field34487[Direction.NORTH.ordinal()] = 6;
      } catch (NoSuchFieldError var6) {
      }

      field34486 = new int[Class113.values().length];

      try {
         field34486[Class113.field413.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field34486[Class113.field414.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field34486[Class113.field415.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
