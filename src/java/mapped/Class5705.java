package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5705 extends Class5651<BeeEntity, Class2862<BeeEntity>> {
   private static final ResourceLocation field25075 = new ResourceLocation("textures/entity/bee/bee_angry.png");
   private static final ResourceLocation field25076 = new ResourceLocation("textures/entity/bee/bee_angry_nectar.png");
   private static final ResourceLocation field25077 = new ResourceLocation("textures/entity/bee/bee.png");
   private static final ResourceLocation field25078 = new ResourceLocation("textures/entity/bee/bee_nectar.png");

   public Class5705(EntityRendererManager var1) {
      super(var1, new Class2862<BeeEntity>(), 0.4F);
   }

   public ResourceLocation method17843(BeeEntity var1) {
      if (!var1.method4369()) {
         return !var1.method4438() ? field25077 : field25078;
      } else {
         return !var1.method4438() ? field25075 : field25076;
      }
   }
}
