package mapped;

// $VF: synthetic class
public class Class9621 {
   private static String[] field44996;
   public static final int[] field44997;
   public static final int[] field44998 = new int[Direction.values().length];

   static {
      try {
         field44998[Direction.field413.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field44998[Direction.field415.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      field44997 = new int[net.minecraft.util.Direction.values().length];

      try {
         field44997[net.minecraft.util.Direction.DOWN.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field44997[net.minecraft.util.Direction.field673.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field44997[net.minecraft.util.Direction.EAST.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field44997[net.minecraft.util.Direction.WEST.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field44997[net.minecraft.util.Direction.NORTH.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field44997[net.minecraft.util.Direction.SOUTH.ordinal()] = 6;
      } catch (NoSuchFieldError var3) {
      }
   }
}
