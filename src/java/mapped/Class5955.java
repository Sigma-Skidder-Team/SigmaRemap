package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;

public class Class5955 extends Class5942<Class945> {
   private static String[] field25967;

   public Class5955(TileEntityRendererDispatcher var1) {
      super(var1);
   }

   public void method18462(Class945 var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      Direction var9 = var1.getBlockState().<Direction>get(Class3244.field18701);
      NonNullList var10 = var1.method3795();

      for (int var11 = 0; var11 < var10.size(); var11++) {
         ItemStack var12 = (ItemStack)var10.get(var11);
         if (var12 != ItemStack.EMPTY) {
            var3.push();
            var3.translate(0.5, 0.44921875, 0.5);
            Direction var13 = Direction.byHorizontalIndex((var11 + var9.getHorizontalIndex()) % 4);
            float var14 = -var13.getHorizontalAngle();
            var3.rotate(Vector3f.YP.rotationDegrees(var14));
            var3.rotate(Vector3f.XP.rotationDegrees(90.0F));
            var3.translate(-0.3125, -0.3125, 0.0);
            var3.method35292(0.375F, 0.375F, 0.375F);
            Minecraft.getInstance().getItemRenderer().method789(var12, Class2327.field15932, var5, var6, var3, var4);
            var3.pop();
         }
      }
   }
}
