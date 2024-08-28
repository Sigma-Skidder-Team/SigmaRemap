package mapped;

public class Class4592 extends Class4587 {
   private static String[] field22077;
   private final Class2828 field22078 = new Class2820();
   private final Class4520 field22079 = Class4520.method14318(Class5659.field25023);

   public Class4592(Class1656 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
      this.field22057 = 0.0F;
      this.field22056 = 30;
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29738;
   }

   @Override
   public void method14510(Class5422 var1, Class9624 var2, float var3) {
      float var6 = ((float)this.field22055 + var3) / (float)this.field22056;
      float var7 = 0.05F + 0.5F * Class9679.method37763(var6 * (float) Math.PI);
      Class9332 var8 = new Class9332();
      var8.method35293(var2.method37508());
      var8.method35293(Class7680.field32898.method25286(150.0F * var6 - 60.0F));
      var8.method35292(-1.0F, -1.0F, 1.0F);
      var8.method35291(0.0, -1.101F, 1.5);
      Class7735 var9 = Minecraft.getInstance().method1581().method26536();
      Class5422 var10 = var9.method25597(this.field22079);
      this.field22078.method11016(var8, var10, 15728880, Class213.field798, 1.0F, 1.0F, 1.0F, var7);
      var9.method25602();
   }
}
