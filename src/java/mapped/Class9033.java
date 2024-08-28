package mapped;

// $VF: synthetic class
public class Class9033 {
   private static String[] field41331;
   public static final int[] field41332 = new int[Direction.values().length];

   static {
      try {
         field41332[Direction.NORTH.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field41332[Direction.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field41332[Direction.WEST.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
