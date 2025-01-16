package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.vector.Vector3f;

public class Class260 extends Class219<SnowGolemEntity, Class2878<SnowGolemEntity>> {
   private static String[] field920;

   public Class260(Class5714<SnowGolemEntity, Class2878<SnowGolemEntity>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, SnowGolemEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.isInvisible() && var4.method4531()) {
         var1.push();
         this.method825().method11197().translateRotate(var1);
         float var13 = 0.625F;
         var1.translate(0.0, -0.34375, 0.0);
         var1.rotate(Vector3f.YP.rotationDegrees(180.0F));
         var1.scale(0.625F, -0.625F, -0.625F);
         ItemStack var14 = new ItemStack(Blocks.CARVED_PUMPKIN);
         Minecraft.getInstance()
            .getItemRenderer()
            .method790(var4, var14, ItemCameraTransformsTransformType.HEAD, false, var1, var2, var4.world, var3, LivingRenderer.method17883(var4, 0.0F));
         var1.pop();
      }
   }
}
