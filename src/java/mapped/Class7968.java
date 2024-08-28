package mapped;

// $VF: synthetic class
public class Class7968 {
   private static String[] field34257;
   public static final int[] field34258 = new int[Direction.values().length];

   static {
      try {
         field34258[Direction.NORTH.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field34258[Direction.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field34258[Direction.WEST.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field34258[Direction.EAST.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
