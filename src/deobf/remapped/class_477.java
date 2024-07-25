package remapped;

public class class_477 extends class_2944 implements class_6161 {
   private int field_2966 = 512;

   public class_477(String var1, Throwable var2) {
      super(var1, var2);
   }

   public class_477(int var1, Throwable var2) {
      this(method_2269(var1), var2);
      this.field_2966 = var1;
   }

   public int method_2268() {
      return this.field_2966;
   }

   public static String method_2269(int var0) {
      return "Decoder errorcode " + Integer.toHexString(var0);
   }
}
