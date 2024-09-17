package mapped;

// $VF: synthetic class
public class Class9825 {
   private static String[] field45903;
   public static final int[] field45904 = new int[Direction.values().length];

   static {
      try {
         field45904[Direction.X.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field45904[Direction.Y.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field45904[Direction.Z.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
