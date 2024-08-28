package mapped;

// $VF: synthetic class
public class Class7719 {
   private static String[] field33127;
   public static final int[] field33128 = new int[Direction.values().length];

   static {
      try {
         field33128[Direction.NORTH.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field33128[Direction.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field33128[Direction.EAST.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field33128[Direction.WEST.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
