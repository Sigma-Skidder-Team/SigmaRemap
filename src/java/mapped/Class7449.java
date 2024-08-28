package mapped;

// $VF: synthetic class
public class Class7449 {
   private static String[] field32048;
   public static final int[] field32049 = new int[Direction.values().length];

   static {
      try {
         field32049[Direction.field672.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field32049[Direction.field673.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field32049[Direction.NORTH.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field32049[Direction.SOUTH.ordinal()] = 4;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field32049[Direction.WEST.ordinal()] = 5;
      } catch (NoSuchFieldError var3) {
      }
   }
}
