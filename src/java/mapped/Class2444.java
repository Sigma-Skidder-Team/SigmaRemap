package mapped;

public class Class2444 extends Class2437 implements Class2442 {
   private int field16523 = 256;

   public Class2444(String var1, Throwable var2) {
      super(var1, var2);
   }

   public Class2444(int var1, Throwable var2) {
      this(method10456(var1), var2);
      this.field16523 = var1;
   }

   public int method10455() {
      return this.field16523;
   }

   public static String method10456(int var0) {
      return "Bitstream errorcode " + Integer.toHexString(var0);
   }
}
