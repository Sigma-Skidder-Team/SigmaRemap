package remapped;

public class class_8496 {
   private static String[] field_43517;

   public static int method_39153(int var0) {
      return var0 >>> 24;
   }

   public static int method_39151(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int method_39152(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int method_39157(int var0) {
      return var0 & 0xFF;
   }

   public static int method_39154(int var0, int var1, int var2, int var3) {
      return var0 << 24 | var1 << 16 | var2 << 8 | var3;
   }

   public static int method_39155(int var0, int var1) {
      return method_39154(
         method_39153(var0) * method_39153(var1) / 255,
         method_39151(var0) * method_39151(var1) / 255,
         method_39152(var0) * method_39152(var1) / 255,
         method_39157(var0) * method_39157(var1) / 255
      );
   }
}
