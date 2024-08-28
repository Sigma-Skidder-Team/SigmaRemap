package mapped;

public class Class5745 extends Class5651<Class1089, Class2874<Class1089>> {
   private static final ResourceLocation field25169 = new ResourceLocation("textures/entity/chicken.png");

   public Class5745(Class8853 var1) {
      super(var1, new Class2874<Class1089>(), 0.3F);
   }

   public ResourceLocation method17843(Class1089 var1) {
      return field25169;
   }

   public float method17871(Class1089 var1, float var2) {
      float var5 = Class9679.method37821(var2, var1.field5968, var1.field5965);
      float var6 = Class9679.method37821(var2, var1.field5967, var1.field5966);
      return (Class9679.method37763(var5) + 1.0F) * var6;
   }
}
