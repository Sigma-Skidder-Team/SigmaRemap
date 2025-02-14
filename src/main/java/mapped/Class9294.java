package mapped;

// $VF: synthetic class
public class Class9294 {
   private static String[] field42736;
   public static final int[] field42737 = new int[CloudOption.values().length];

   static {
      try {
         field42737[CloudOption.field11186.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field42737[CloudOption.FAST.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field42737[CloudOption.OFF.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
