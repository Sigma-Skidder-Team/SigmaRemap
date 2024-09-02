package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class9621 {
   private static String[] field44996;
   public static final int[] field44997;
   public static final int[] field44998 = new int[Class113.values().length];

   static {
      try {
         field44998[Class113.field413.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field44998[Class113.field415.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      field44997 = new int[Direction.values().length];

      try {
         field44997[Direction.DOWN.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field44997[Direction.field673.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field44997[Direction.EAST.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field44997[Direction.WEST.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field44997[Direction.NORTH.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field44997[Direction.SOUTH.ordinal()] = 6;
      } catch (NoSuchFieldError var3) {
      }
   }
}
