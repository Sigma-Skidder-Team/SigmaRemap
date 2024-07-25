package remapped;

import java.util.Arrays;

public final class class_6121 {
   private static final String field_31287 = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_";
   private static final String field_31288 = "\n\u0085\u2028\u2029";
   private static final String field_31293 = "\r\n\u0085\u2028\u2029";
   private static final String field_31296 = "\u0000\r\n\u0085\u2028\u2029";
   private static final String field_31297 = " \u0000\r\n\u0085\u2028\u2029";
   private static final String field_31285 = "\t \u0000\r\n\u0085\u2028\u2029";
   private static final String field_31292 = "\u0000 \t";
   private static final String field_31295 = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$,_.!~*'()[]%";
   public static final class_6121 field_31291 = new class_6121("\n\u0085\u2028\u2029");
   public static final class_6121 field_31281 = new class_6121("\r\n\u0085\u2028\u2029");
   public static final class_6121 field_31290 = new class_6121("\u0000\r\n\u0085\u2028\u2029");
   public static final class_6121 field_31280 = new class_6121(" \u0000\r\n\u0085\u2028\u2029");
   public static final class_6121 field_31299 = new class_6121("\t \u0000\r\n\u0085\u2028\u2029");
   public static final class_6121 field_31298 = new class_6121("\u0000 \t");
   public static final class_6121 field_31282 = new class_6121("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$,_.!~*'()[]%");
   public static final class_6121 field_31289 = new class_6121("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_");
   private String field_31286;
   public boolean[] field_31283 = new boolean[128];
   public boolean field_31284 = false;

   private class_6121(String var1) {
      Arrays.fill(this.field_31283, false);
      StringBuilder var4 = new StringBuilder();

      for (int var5 = 0; var5 < var1.length(); var5++) {
         int var6 = var1.codePointAt(var5);
         if (var6 >= 128) {
            var4.appendCodePoint(var6);
         } else {
            this.field_31283[var6] = true;
         }
      }

      if (var4.length() > 0) {
         this.field_31284 = true;
         this.field_31286 = var4.toString();
      }
   }

   public boolean method_28112(int var1) {
      return var1 >= 128 ? this.field_31284 && this.field_31286.indexOf(var1, 0) != -1 : this.field_31283[var1];
   }

   public boolean method_28109(int var1) {
      return !this.method_28112(var1);
   }

   public boolean method_28113(int var1, String var2) {
      return this.method_28112(var1) || var2.indexOf(var1, 0) != -1;
   }

   public boolean method_28110(int var1, String var2) {
      return !this.method_28113(var1, var2);
   }
}
