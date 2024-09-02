package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class9295 {
   private static String[] field42738;
   public static final int[] field42739;
   public static final int[] field42740 = new int[Direction.values().length];

   static {
      try {
         field42740[Direction.NORTH.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field42740[Direction.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field42740[Direction.WEST.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field42740[Direction.EAST.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      field42739 = new int[Class2213.values().length];

      try {
         field42739[Class2213.field14470.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field42739[Class2213.field14471.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field42739[Class2213.field14472.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field42739[Class2213.field14473.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
