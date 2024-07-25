package remapped;

public class class_3731 extends class_2944 implements class_162 {
   private int field_18245 = 256;

   public class_3731(String var1, Throwable var2) {
      super(var1, var2);
   }

   public class_3731(int var1, Throwable var2) {
      this(method_17284(var1), var2);
      this.field_18245 = var1;
   }

   public int method_17285() {
      return this.field_18245;
   }

   public static String method_17284(int var0) {
      return "Bitstream errorcode " + Integer.toHexString(var0);
   }
}
