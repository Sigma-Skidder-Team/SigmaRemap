package mapped;

public class Class5681 extends Class5651<Class1110, Class2806<Class1110>> {
   private static final ResourceLocation field25046 = new ResourceLocation("textures/entity/phantom.png");

   public Class5681(EntityRendererManager var1) {
      super(var1, new Class2806<Class1110>(), 0.75F);
      this.method17880(new Class229<Class1110>(this));
   }

   public ResourceLocation method17843(Class1110 var1) {
      return field25046;
   }

   public void method17857(Class1110 var1, MatrixStack var2, float var3) {
      int var6 = var1.method5338();
      float var7 = 1.0F + 0.15F * (float)var6;
      var2.method35292(var7, var7, var7);
      var2.translate(0.0, 1.3125, 0.1875);
   }

   public void method17842(Class1110 var1, MatrixStack var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      var2.method35293(Class7680.field32898.method25286(var1.rotationPitch));
   }
}
