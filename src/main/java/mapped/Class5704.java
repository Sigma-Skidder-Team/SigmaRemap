package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5704 extends Class5651<SilverfishEntity, Class2815<SilverfishEntity>> {
   private static final ResourceLocation field25074 = new ResourceLocation("textures/entity/silverfish.png");

   public Class5704(EntityRendererManager var1) {
      super(var1, new Class2815<SilverfishEntity>(), 0.3F);
   }

   public float method17865(SilverfishEntity var1) {
      return 180.0F;
   }

   public ResourceLocation method17843(SilverfishEntity var1) {
      return field25074;
   }
}
