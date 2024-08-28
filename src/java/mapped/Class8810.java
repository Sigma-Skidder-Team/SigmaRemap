package mapped;

// $VF: synthetic class
public class Class8810 {
   private static String[] field39643;
   public static final int[] field39644 = new int[Direction.values().length];

   static {
      try {
         field39644[Direction.NORTH.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field39644[Direction.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field39644[Direction.WEST.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field39644[Direction.EAST.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
