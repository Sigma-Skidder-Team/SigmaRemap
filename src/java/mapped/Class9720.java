package mapped;

// $VF: synthetic class
public class Class9720 {
   private static String[] field45411;
   public static final int[] field45412 = new int[OS.values().length];

   static {
      try {
         field45412[OS.WINDOWS.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field45412[OS.OSX.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field45412[OS.LINUX.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
