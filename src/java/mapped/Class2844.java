package mapped;

public class Class2844 extends Class2828 {
   private static String[] field17643;
   public final Class7219 field17644;

   public Class2844() {
      this(0, 35, 64, 64);
   }

   public Class2844(int var1, int var2, int var3, int var4) {
      super(Class4520::method14318);
      this.field17604 = var3;
      this.field17605 = var4;
      this.field17644 = new Class7219(this, var1, var2);
      this.field17644.method22675(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F);
      this.field17644.method22679(0.0F, 0.0F, 0.0F);
   }

   public void method11174(float var1, float var2, float var3) {
      this.field17644.field31036 = var2 * (float) (Math.PI / 180.0);
      this.field17644.field31035 = var3 * (float) (Math.PI / 180.0);
   }

   @Override
   public void method11016(Class9332 var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field17644.method22681(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
