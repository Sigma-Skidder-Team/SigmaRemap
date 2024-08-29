package mapped;

public class Class5709 extends Class5651<Class1064, Class2854<Class1064>> {
   private static final ResourceLocation[] field25082 = new ResourceLocation[]{
      new ResourceLocation("textures/entity/llama/creamy.png"),
      new ResourceLocation("textures/entity/llama/white.png"),
      new ResourceLocation("textures/entity/llama/brown.png"),
      new ResourceLocation("textures/entity/llama/gray.png")
   };

   public Class5709(EntityRendererManager var1) {
      super(var1, new Class2854<Class1064>(0.0F), 0.7F);
      this.method17880(new Class236(this));
   }

   public ResourceLocation method17843(Class1064 var1) {
      return field25082[var1.method4889()];
   }
}
