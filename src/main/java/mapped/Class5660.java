package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5660 extends Class5651<SnowGolemEntity, Class2878<SnowGolemEntity>> {
   private static final ResourceLocation field25024 = new ResourceLocation("textures/entity/snow_golem.png");

   public Class5660(EntityRendererManager var1) {
      super(var1, new Class2878<SnowGolemEntity>(), 0.5F);
      this.addLayer(new Class260(this));
   }

   public ResourceLocation method17843(SnowGolemEntity var1) {
      return field25024;
   }
}
