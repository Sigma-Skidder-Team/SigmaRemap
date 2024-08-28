package mapped;

public class Class5750 extends Class5651<Class1053, Class2816<Class1053>> {
   private static final ResourceLocation field25178 = new ResourceLocation("textures/entity/fish/salmon.png");

   public Class5750(Class8853 var1) {
      super(var1, new Class2816<Class1053>(), 0.4F);
   }

   public ResourceLocation method17843(Class1053 var1) {
      return field25178;
   }

   public void method17842(Class1053 var1, Class9332 var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      float var8 = 1.0F;
      float var9 = 1.0F;
      if (!var1.method3250()) {
         var8 = 1.3F;
         var9 = 1.7F;
      }

      float var10 = var8 * 4.3F * Class9679.method37763(var9 * 0.6F * var3);
      var2.method35293(Class7680.field32900.method25286(var10));
      var2.method35291(0.0, 0.0, -0.4F);
      if (!var1.method3250()) {
         var2.method35291(0.2F, 0.1F, 0.0);
         var2.method35293(Class7680.field32902.method25286(90.0F));
      }
   }
}
