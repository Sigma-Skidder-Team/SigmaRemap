package mapped;

public class Class5697 extends Class5651<Class1015, Class2814> {
   public static final ResourceLocation[] field25067 = new ResourceLocation[]{
      new ResourceLocation("textures/entity/parrot/parrot_red_blue.png"),
      new ResourceLocation("textures/entity/parrot/parrot_blue.png"),
      new ResourceLocation("textures/entity/parrot/parrot_green.png"),
      new ResourceLocation("textures/entity/parrot/parrot_yellow_blue.png"),
      new ResourceLocation("textures/entity/parrot/parrot_grey.png")
   };

   public Class5697(Class8853 var1) {
      super(var1, new Class2814(), 0.3F);
   }

   public ResourceLocation method17843(Class1015 var1) {
      return field25067[var1.method4414()];
   }

   public float method17871(Class1015 var1, float var2) {
      float var5 = Class9679.method37821(var2, var1.field5680, var1.field5677);
      float var6 = Class9679.method37821(var2, var1.field5679, var1.field5678);
      return (Class9679.method37763(var5) + 1.0F) * var6;
   }
}
