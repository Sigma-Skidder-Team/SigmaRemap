package mapped;

public class Class2438 extends Class2437 implements Class2439 {
   private int field16479 = 512;

   public Class2438(String var1, Throwable var2) {
      super(var1, var2);
   }

   public Class2438(int var1, Throwable var2) {
      this(method10420(var1), var2);
      this.field16479 = var1;
   }

   public int method10419() {
      return this.field16479;
   }

   public static String method10420(int var0) {
      return "Decoder errorcode " + Integer.toHexString(var0);
   }
}
