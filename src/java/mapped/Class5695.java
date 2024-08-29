package mapped;

public class Class5695 extends Class5651<Class1051, Class2822<Class1051>> {
   private static final ResourceLocation field25065 = new ResourceLocation("textures/entity/fish/cod.png");

   public Class5695(EntityRendererManager var1) {
      super(var1, new Class2822<Class1051>(), 0.3F);
   }

   public ResourceLocation method17843(Class1051 var1) {
      return field25065;
   }

   public void method17842(Class1051 var1, MatrixStack var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      float var8 = 4.3F * MathHelper.sin(0.6F * var3);
      var2.method35293(Class7680.field32900.method25286(var8));
      if (!var1.method3250()) {
         var2.translate(0.1F, 0.1F, -0.1F);
         var2.method35293(Class7680.field32902.method25286(90.0F));
      }
   }
}
