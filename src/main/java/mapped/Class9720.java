package mapped;

import net.minecraft.util.Util;

// $VF: synthetic class
public class Class9720 {
   private static String[] field45411;
   public static final int[] field45412 = new int[Util.OS.values().length];

   static {
      try {
         field45412[Util.OS.WINDOWS.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field45412[Util.OS.OSX.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field45412[Util.OS.LINUX.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
