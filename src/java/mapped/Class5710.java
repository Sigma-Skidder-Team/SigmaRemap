package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

public class Class5710 extends Class5651<BlazeEntity, Class2886<BlazeEntity>> {
   private static final ResourceLocation field25083 = new ResourceLocation("textures/entity/blaze.png");

   public Class5710(EntityRendererManager var1) {
      super(var1, new Class2886<BlazeEntity>(), 0.5F);
   }

   public int method17858(BlazeEntity var1, BlockPos var2) {
      return 15;
   }

   public ResourceLocation method17843(BlazeEntity var1) {
      return field25083;
   }
}
