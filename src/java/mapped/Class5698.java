package mapped;

public class Class5698 extends Class5651<Class1081, Class2890<Class1081>> {
   private static final ResourceLocation field25068 = new ResourceLocation("textures/entity/creeper/creeper.png");

   public Class5698(Class8853 var1) {
      super(var1, new Class2890<Class1081>(), 0.5F);
      this.method17880(new Class225(this));
   }

   public void method17857(Class1081 var1, Class9332 var2, float var3) {
      float var6 = var1.method5019(var3);
      float var7 = 1.0F + MathHelper.method37763(var6 * 100.0F) * var6 * 0.01F;
      var6 = MathHelper.method37777(var6, 0.0F, 1.0F);
      var6 *= var6;
      var6 *= var6;
      float var8 = (1.0F + var6 * 0.4F) * var7;
      float var9 = (1.0F + var6 * 0.1F) / var7;
      var2.method35292(var8, var9, var8);
   }

   public float method17879(Class1081 var1, float var2) {
      float var5 = var1.method5019(var2);
      return (int)(var5 * 10.0F) % 2 != 0 ? MathHelper.method37777(var5, 0.5F, 1.0F) : 0.0F;
   }

   public ResourceLocation method17843(Class1081 var1) {
      return field25068;
   }
}
