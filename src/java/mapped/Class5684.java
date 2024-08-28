package mapped;

public class Class5684 extends Class5651<Class1112, Class2817<Class1112>> {
   private static final ResourceLocation field25050 = new ResourceLocation("textures/entity/ghast/ghast.png");
   private static final ResourceLocation field25051 = new ResourceLocation("textures/entity/ghast/ghast_shooting.png");

   public Class5684(Class8853 var1) {
      super(var1, new Class2817<Class1112>(), 1.5F);
   }

   public ResourceLocation method17843(Class1112 var1) {
      return !var1.method5357() ? field25050 : field25051;
   }

   public void method17857(Class1112 var1, MatrixStack var2, float var3) {
      float var6 = 1.0F;
      float var7 = 4.5F;
      float var8 = 4.5F;
      var2.method35292(4.5F, 4.5F, 4.5F);
   }
}
