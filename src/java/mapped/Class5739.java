package mapped;

public class Class5739 extends Class5715<Class996> {
   private static final ResourceLocation field25161 = new ResourceLocation("textures/entity/lead_knot.png");
   private final Class2889<Class996> field25162 = new Class2889<Class996>();

   public Class5739(Class8853 var1) {
      super(var1);
   }

   public void method17853(Class996 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.method35294();
      var4.method35292(-1.0F, -1.0F, 1.0F);
      this.field25162.method10998(var1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      Class5422 var9 = var5.method25597(this.field25162.method11028(field25161));
      this.field25162.method11016(var4, var9, var6, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.method35295();
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(Class996 var1) {
      return field25161;
   }
}
