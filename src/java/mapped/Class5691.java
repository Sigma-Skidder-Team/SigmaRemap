package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5691 extends Class5651<PigEntity, Class2872<PigEntity>> {
   private static final ResourceLocation field25060 = new ResourceLocation("textures/entity/pig/pig.png");

   public Class5691(EntityRendererManager var1) {
      super(var1, new Class2872<PigEntity>(), 0.7F);
      this.addLayer(new Class238<PigEntity, Class2872<PigEntity>>(this, new Class2872<PigEntity>(0.5F), new ResourceLocation("textures/entity/pig/pig_saddle.png")));
   }

   public ResourceLocation method17843(PigEntity var1) {
      return field25060;
   }
}
