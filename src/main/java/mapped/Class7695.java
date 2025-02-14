package mapped;

public class Class7695 implements Class7693 {
   private static String[] field32942;
   private int field32943;

   public Class7695(int var1) {
      this.field32943 = var1;
   }

   @Override
   public float method25325(Class7237 var1, Class7559 var2, int var3, int var4, int var5, int var6) {
      return (float)(this.field32943 * (Math.abs(var3 - var5) + Math.abs(var4 - var6)));
   }
}
