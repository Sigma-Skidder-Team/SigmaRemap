package mapped;

public class Class5746 extends Class5651<Class1058, Class2880<Class1058>> {
   private static final ResourceLocation field25170 = new ResourceLocation("textures/entity/iron_golem/iron_golem.png");

   public Class5746(Class8853 var1) {
      super(var1, new Class2880<Class1058>(), 0.7F);
      this.method17880(new Class251(this));
      this.method17880(new Class230(this));
   }

   public ResourceLocation method17843(Class1058 var1) {
      return field25170;
   }

   public void method17842(Class1058 var1, MatrixStack var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      if (!((double)var1.field4960 < 0.01)) {
         float var8 = 13.0F;
         float var9 = var1.field4961 - var1.field4960 * (1.0F - var5) + 6.0F;
         float var10 = (Math.abs(var9 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         var2.method35293(Class7680.field32902.method25286(6.5F * var10));
      }
   }
}
