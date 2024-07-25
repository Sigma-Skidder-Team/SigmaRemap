package remapped;

import java.awt.Color;

public class class_1516 {
   private static String[] field_8078;

   public static int method_6936(Color var0) {
      return method_6935(var0.getRed(), var0.getGreen(), var0.getBlue(), var0.getAlpha());
   }

   public static int method_6932(int var0) {
      return method_6935(var0, var0, var0, 255);
   }

   public static int method_6933(int var0, int var1) {
      return method_6935(var0, var0, var0, var1);
   }

   public static int method_6934(int var0, int var1, int var2) {
      return method_6935(var0, var1, var2, 255);
   }

   public static int method_6935(int var0, int var1, int var2, int var3) {
      int var6 = 0;
      var6 |= var3 << 24;
      var6 |= var0 << 16;
      var6 |= var1 << 8;
      return var6 | var2;
   }
}
