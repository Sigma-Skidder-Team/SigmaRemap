package mapped;

import java.awt.Color;

public class Class7211 {
   private static String[] field31008;

   public static int method22641(Color var0) {
      return method22645(var0.getRed(), var0.getGreen(), var0.getBlue(), var0.getAlpha());
   }

   public static int method22642(int var0) {
      return method22645(var0, var0, var0, 255);
   }

   public static int method22643(int var0, int var1) {
      return method22645(var0, var0, var0, var1);
   }

   public static int method22644(int var0, int var1, int var2) {
      return method22645(var0, var1, var2, 255);
   }

   public static int method22645(int var0, int var1, int var2, int var3) {
      int var6 = 0;
      var6 |= var3 << 24;
      var6 |= var0 << 16;
      var6 |= var1 << 8;
      return var6 | var2;
   }
}
