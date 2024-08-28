package mapped;

public class Class9384 {
   private static String[] field43535;
   private int field43536;
   private int field43537;
   private int field43538;
   private int field43539;
   private byte[] field43540;

   private Class9384() {
   }

   public static Class9384 method35610(Class8563 var0, boolean var1) throws Exception {
      Class9384 var4 = new Class9384();
      var4.method35612(var0.<Integer>method30559(Class4750.field22526));
      var4.method35614(var0.<Integer>method30559(Class4750.field22526));
      var4.method35616(var0.<Integer>method30559(Class4750.field22536));
      int var5 = Integer.bitCount(var4.method35615());
      var4.method35618(var5 * 10240 + (!var1 ? 0 : var5 * 2048) + 256);
      return var4;
   }

   public int method35611() {
      return this.field43536;
   }

   public void method35612(int var1) {
      this.field43536 = var1;
   }

   public int method35613() {
      return this.field43537;
   }

   public void method35614(int var1) {
      this.field43537 = var1;
   }

   public int method35615() {
      return this.field43538;
   }

   public void method35616(int var1) {
      this.field43538 = var1;
   }

   public int method35617() {
      return this.field43539;
   }

   public void method35618(int var1) {
      this.field43539 = var1;
   }

   public byte[] method35619() {
      return this.field43540;
   }

   public void method35620(byte[] var1) {
      this.field43540 = var1;
   }
}
