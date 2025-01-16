package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class Class5740 extends EntityRenderer<TntEntity> {
   private static String[] field25163;

   public Class5740(EntityRendererManager var1) {
      super(var1);
      this.shadowSize = 0.5F;
   }

   public void render(TntEntity var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      var4.translate(0.0, 0.5, 0.0);
      if ((float)var1.method4184() - var3 + 1.0F < 10.0F) {
         float var9 = 1.0F - ((float)var1.method4184() - var3 + 1.0F) / 10.0F;
         var9 = MathHelper.clamp(var9, 0.0F, 1.0F);
         var9 *= var9;
         var9 *= var9;
         float var10 = 1.0F + var9 * 0.3F;
         var4.scale(var10, var10, var10);
      }

      var4.rotate(Vector3f.YP.rotationDegrees(-90.0F));
      var4.translate(-0.5, -0.5, 0.5);
      var4.rotate(Vector3f.YP.rotationDegrees(90.0F));
      Class5733.method17916(Blocks.TNT.getDefaultState(), var4, var5, var6, var1.method4184() / 5 % 2 == 0);
      var4.pop();
      super.render(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(TntEntity var1) {
      return AtlasTexture.LOCATION_BLOCKS_TEXTURE;
   }
}
