package mapped;

public class Class5657 extends Class5651<Class1070, Class2888<Class1070>> {
   private static final ResourceLocation field25018 = new ResourceLocation("textures/entity/strider/strider.png");
   private static final ResourceLocation field25019 = new ResourceLocation("textures/entity/strider/strider_cold.png");

   public Class5657(Class8853 var1) {
      super(var1, new Class2888<Class1070>(), 0.5F);
      this.method17880(
         new Class238<Class1070, Class2888<Class1070>>(this, new Class2888<Class1070>(), new ResourceLocation("textures/entity/strider/strider_saddle.png"))
      );
   }

   public ResourceLocation method17843(Class1070 var1) {
      return !var1.method4978() ? field25018 : field25019;
   }

   public void method17857(Class1070 var1, Class9332 var2, float var3) {
      if (!var1.method3005()) {
         this.field25098 = 0.5F;
      } else {
         var2.method35292(0.5F, 0.5F, 0.5F);
         this.field25098 = 0.25F;
      }
   }

   public boolean method17860(Class1070 var1) {
      return var1.method4978();
   }
}
