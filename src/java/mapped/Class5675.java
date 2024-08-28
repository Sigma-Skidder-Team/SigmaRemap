package mapped;

public class Class5675 extends Class5651<Class1108, Class2826<Class1108>> {
   private static final ResourceLocation field25041 = new ResourceLocation("textures/entity/slime/slime.png");

   public Class5675(Class8853 var1) {
      super(var1, new Class2826<Class1108>(16), 0.25F);
      this.method17880(new Class247<Class1108>(this));
   }

   public void method17853(Class1108 var1, float var2, float var3, Class9332 var4, Class7733 var5, int var6) {
      this.field25098 = 0.25F * (float)var1.method5319();
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public void method17857(Class1108 var1, Class9332 var2, float var3) {
      float var6 = 0.999F;
      var2.method35292(0.999F, 0.999F, 0.999F);
      var2.method35291(0.0, 0.001F, 0.0);
      float var7 = (float)var1.method5319();
      float var8 = Class9679.method37821(var3, var1.field6084, var1.field6083) / (var7 * 0.5F + 1.0F);
      float var9 = 1.0F / (var8 + 1.0F);
      var2.method35292(var9 * var7, 1.0F / var9 * var7, var9 * var7);
   }

   public ResourceLocation method17843(Class1108 var1) {
      return field25041;
   }
}
