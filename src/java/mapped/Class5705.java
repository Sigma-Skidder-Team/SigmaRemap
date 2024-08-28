package mapped;

public class Class5705 extends Class5651<Class1017, Class2862<Class1017>> {
   private static final ResourceLocation field25075 = new ResourceLocation("textures/entity/bee/bee_angry.png");
   private static final ResourceLocation field25076 = new ResourceLocation("textures/entity/bee/bee_angry_nectar.png");
   private static final ResourceLocation field25077 = new ResourceLocation("textures/entity/bee/bee.png");
   private static final ResourceLocation field25078 = new ResourceLocation("textures/entity/bee/bee_nectar.png");

   public Class5705(Class8853 var1) {
      super(var1, new Class2862<Class1017>(), 0.4F);
   }

   public ResourceLocation method17843(Class1017 var1) {
      if (!var1.method4369()) {
         return !var1.method4438() ? field25077 : field25078;
      } else {
         return !var1.method4438() ? field25075 : field25076;
      }
   }
}
