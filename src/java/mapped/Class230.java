package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.math.vector.Vector3f;

public class Class230 extends Class219<IronGolemEntity, Class2880<IronGolemEntity>> {
   private static String[] field875;

   public Class230(Class5714<IronGolemEntity, Class2880<IronGolemEntity>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, IronGolemEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.method4868() != 0) {
         var1.push();
         ModelRenderer var13 = this.method825().method11198();
         var13.translateRotate(var1);
         var1.translate(-1.1875, 1.0625, -0.9375);
         var1.translate(0.5, 0.5, 0.5);
         float var14 = 0.5F;
         var1.scale(0.5F, 0.5F, 0.5F);
         var1.rotate(Vector3f.XP.rotationDegrees(-90.0F));
         var1.translate(-0.5, -0.5, -0.5);
         Minecraft.getInstance().getBlockRendererDispatcher().method814(Blocks.POPPY.getDefaultState(), var1, var2, var3, OverlayTexture.NO_OVERLAY);
         var1.pop();
      }
   }
}
