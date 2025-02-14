package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5749 extends Class5651<SheepEntity, Class2869<SheepEntity>> {
   private static final ResourceLocation field25177 = new ResourceLocation("textures/entity/sheep/sheep.png");

   public Class5749(EntityRendererManager var1) {
      super(var1, new Class2869<SheepEntity>(), 0.7F);
      this.addLayer(new Class249(this));
   }

   public ResourceLocation method17843(SheepEntity var1) {
      return field25177;
   }
}
