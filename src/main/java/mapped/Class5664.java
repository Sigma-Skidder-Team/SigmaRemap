package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.util.ResourceLocation;

public class Class5664 extends Class5663 {
   private static final ResourceLocation field25028 = new ResourceLocation("textures/entity/zombie/husk.png");

   public Class5664(EntityRendererManager var1) {
      super(var1);
   }

   public void method17857(ZombieEntity var1, MatrixStack var2, float var3) {
      float var6 = 1.0625F;
      var2.scale(1.0625F, 1.0625F, 1.0625F);
      super.method17857(var1, var2, var3);
   }

   @Override
   public ResourceLocation method17843(ZombieEntity var1) {
      return field25028;
   }
}
