package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5673 extends Class5651<EndermiteEntity, Class2807<EndermiteEntity>> {
   private static final ResourceLocation field25038 = new ResourceLocation("textures/entity/endermite.png");

   public Class5673(EntityRendererManager var1) {
      super(var1, new Class2807<EndermiteEntity>(), 0.3F);
   }

   public float method17865(EndermiteEntity var1) {
      return 180.0F;
   }

   public ResourceLocation method17843(EndermiteEntity var1) {
      return field25038;
   }
}
