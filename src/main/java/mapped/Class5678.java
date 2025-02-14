package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5678 extends Class5676<VindicatorEntity> {
   private static final ResourceLocation field25043 = new ResourceLocation("textures/entity/illager/vindicator.png");

   public Class5678(EntityRendererManager var1) {
      super(var1, new Class2823<VindicatorEntity>(0.0F, 0.0F, 64, 64), 0.5F);
      this.addLayer(new Class244(this, this));
   }

   public ResourceLocation method17843(VindicatorEntity var1) {
      return field25043;
   }
}
