package mapped;

public class Class8055 {
   private static String[] field34587;
   private final Class120 field34588;
   private final int field34589;
   private final int field34590;
   public final Class9235 field34591;

   public Class8055(Class9235 var1, Class120 var2, int var3, int var4) {
      this.field34591 = var1;
      this.field34588 = var2;
      this.field34589 = var3;
      this.field34590 = var4;
   }

   public int method27660() {
      return this.field34589;
   }

   public int method27661() {
      return this.field34590;
   }

   public ItemStack method27662() {
      ItemStack[] var3 = this.field34588.method332();
      return var3[MathHelper.method37767(Class9235.method34740(this.field34591) / 30.0F) % var3.length];
   }
}
