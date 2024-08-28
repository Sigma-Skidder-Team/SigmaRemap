package mapped;

// $VF: synthetic class
public class Class8403 {
   private static String[] field36059;
   public static final int[] field36060 = new int[Direction.values().length];

   static {
      try {
         field36060[Direction.NORTH.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field36060[Direction.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field36060[Direction.WEST.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field36060[Direction.EAST.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
