package mapped;

// $VF: synthetic class
public class Class7594 {
   private static String[] field32601;
   public static final int[] field32602 = new int[Direction.values().length];

   static {
      try {
         field32602[Direction.EAST.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field32602[Direction.WEST.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field32602[Direction.SOUTH.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field32602[Direction.NORTH.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
