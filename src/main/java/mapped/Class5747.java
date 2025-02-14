package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class Class5747 extends Class5651<CatEntity, Class2861<CatEntity>> {
   private static String[] field25171;

   public Class5747(EntityRendererManager var1) {
      super(var1, new Class2861<CatEntity>(0.0F), 0.4F);
      this.addLayer(new Class263(this));
   }

   public ResourceLocation method17843(CatEntity var1) {
      return var1.method5249();
   }

   public void method17857(CatEntity var1, MatrixStack var2, float var3) {
      super.method17857(var1, var2, var3);
      var2.scale(0.8F, 0.8F, 0.8F);
   }

   public void method17842(CatEntity var1, MatrixStack var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      float var8 = var1.method5264(var5);
      if (var8 > 0.0F) {
         var2.translate((double)(0.4F * var8), (double)(0.15F * var8), (double)(0.1F * var8));
         var2.rotate(Vector3f.ZP.rotationDegrees(MathHelper.interpolateAngle(var8, 0.0F, 90.0F)));
         BlockPos var9 = var1.getPosition();

         for (PlayerEntity var11 : var1.world.<PlayerEntity>getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(var9).grow(2.0, 2.0, 2.0))) {
            if (var11.isSleeping()) {
               var2.translate((double)(0.15F * var8), 0.0, 0.0);
               break;
            }
         }
      }
   }
}
