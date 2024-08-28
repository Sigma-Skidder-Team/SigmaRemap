package mapped;

public class Class5652 extends Class5651<Class1109, Class2882<Class1109>> {
   private static final ResourceLocation field25004 = new ResourceLocation("textures/entity/slime/magmacube.png");

   public Class5652(Class8853 var1) {
      super(var1, new Class2882<Class1109>(), 0.25F);
   }

   public int method17858(Class1109 var1, BlockPos var2) {
      return 15;
   }

   public ResourceLocation method17843(Class1109 var1) {
      return field25004;
   }

   public void method17857(Class1109 var1, Class9332 var2, float var3) {
      int var6 = var1.method5319();
      float var7 = MathHelper.method37821(var3, var1.field6084, var1.field6083) / ((float)var6 * 0.5F + 1.0F);
      float var8 = 1.0F / (var7 + 1.0F);
      var2.method35292(var8 * (float)var6, 1.0F / var8 * (float)var6, var8 * (float)var6);
   }
}
