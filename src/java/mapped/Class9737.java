package mapped;

// $VF: synthetic class
public class Class9737 {
   private static String[] field45470;
   public static final int[] field45471 = new int[Direction.values().length];

   static {
      try {
         field45471[Direction.SOUTH.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field45471[Direction.NORTH.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field45471[Direction.WEST.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field45471[Direction.EAST.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
