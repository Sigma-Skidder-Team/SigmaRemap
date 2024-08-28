package mapped;

public class Class5682 extends Class5651<Class1055, Class2879<Class1055>> {
   private static final ResourceLocation field25047 = new ResourceLocation("textures/entity/squid.png");

   public Class5682(Class8853 var1) {
      super(var1, new Class2879<Class1055>(), 0.7F);
   }

   public ResourceLocation method17843(Class1055 var1) {
      return field25047;
   }

   public void method17842(Class1055 var1, Class9332 var2, float var3, float var4, float var5) {
      float var8 = MathHelper.method37821(var5, var1.field5826, var1.field5825);
      float var9 = MathHelper.method37821(var5, var1.field5828, var1.field5827);
      var2.method35291(0.0, 0.5, 0.0);
      var2.method35293(Class7680.field32900.method25286(180.0F - var4));
      var2.method35293(Class7680.field32898.method25286(var8));
      var2.method35293(Class7680.field32900.method25286(var9));
      var2.method35291(0.0, -1.2F, 0.0);
   }

   public float method17871(Class1055 var1, float var2) {
      return MathHelper.method37821(var2, var1.field5832, var1.field5831);
   }
}
