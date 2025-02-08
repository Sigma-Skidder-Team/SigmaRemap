package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.util.math.vector.Vector3f;

public class Class253 extends Class219<EndermanEntity, Class2799<EndermanEntity>> {
   private static String[] field909;

   public Class253(Class5714<EndermanEntity, Class2799<EndermanEntity>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, IRenderTypeBuffer var2, int var3, EndermanEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      BlockState var13 = var4.method4357();
      if (var13 != null) {
         var1.push();
         var1.translate(0.0, 0.6875, -0.75);
         var1.rotate(Vector3f.XP.rotationDegrees(20.0F));
         var1.rotate(Vector3f.YP.rotationDegrees(45.0F));
         var1.translate(0.25, 0.1875, 0.25);
         float var14 = 0.5F;
         var1.scale(-0.5F, -0.5F, 0.5F);
         var1.rotate(Vector3f.YP.rotationDegrees(90.0F));
         Minecraft.getInstance().getBlockRendererDispatcher().method814(var13, var1, var2, var3, OverlayTexture.NO_OVERLAY);
         var1.pop();
      }
   }
}
