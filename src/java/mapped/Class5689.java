package mapped;

public class Class5689 extends Class5651<Class1088, Class2873<Class1088>> {
   private static final ResourceLocation field25056 = new ResourceLocation("textures/entity/turtle/big_sea_turtle.png");

   public Class5689(Class8853 var1) {
      super(var1, new Class2873<Class1088>(0.0F), 0.7F);
   }

   public void method17853(Class1088 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      if (var1.method3005()) {
         this.field25098 *= 0.5F;
      }

      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(Class1088 var1) {
      return field25056;
   }
}
