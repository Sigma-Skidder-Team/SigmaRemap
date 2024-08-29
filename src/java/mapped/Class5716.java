package mapped;

public class Class5716 extends Class5715<Class886> {
   public static final ResourceLocation field25102 = new ResourceLocation("textures/entity/trident.png");
   private final Class2842 field25103 = new Class2842();

   public Class5716(EntityRendererManager var1) {
      super(var1);
   }

   public void method17853(Class886 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      var4.method35293(Class7680.field32900.method25286(MathHelper.method37821(var3, var1.field5033, var1.field5031) - 90.0F));
      var4.method35293(Class7680.field32902.method25286(MathHelper.method37821(var3, var1.field5034, var1.field5032) + 90.0F));
      Class5422 var9 = ItemRenderer.method786(var5, this.field25103.method11028(this.method17843(var1)), false, var1.method3496());
      this.field25103.method11016(var4, var9, var6, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.method35295();
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(Class886 var1) {
      return field25102;
   }
}
