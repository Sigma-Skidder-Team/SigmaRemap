package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.optifine.Config;
import net.optifine.shaders.Shaders;

import java.util.List;

public class Class5947 extends Class5942<Class954> {
   private static String[] field25937;
   private final Class2848 field25938 = new Class2848();
   private static double field25939 = 4096.0;

   public Class5947(TileEntityRendererDispatcher var1) {
      super(var1);
   }

   public void method18462(Class954 var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      BlockState var9 = var1.method3775();
      var3.push();
      float var10 = 0.6666667F;
      if (!(var9.getBlock() instanceof Class3374)) {
         var3.translate(0.5, 0.5, 0.5);
         float var11 = -var9.<Direction>method23463(Class3375.field18972).method551();
         var3.rotate(Vector3f.YP.rotationDegrees(var11));
         var3.translate(0.0, -0.3125, -0.4375);
         this.field25938.field17651.field31039 = false;
      } else {
         var3.translate(0.5, 0.5, 0.5);
         float var26 = -((float)(var9.<Integer>method23463(Class3374.field18970) * 360) / 16.0F);
         var3.rotate(Vector3f.YP.rotationDegrees(var26));
         this.field25938.field17651.field31039 = true;
      }

      var3.push();
      var3.method35292(0.6666667F, -0.6666667F, -0.6666667F);
      Class7826 var27 = method18473(var9.getBlock());
      Class5422 var12 = var27.method26200(var4, this.field25938::method11028);
      this.field25938.field17650.method22680(var3, var12, var5, var6);
      this.field25938.field17651.method22680(var3, var12, var5, var6);
      var3.pop();
      if (method18474(var1)) {
         FontRenderer var13 = this.field25928.method27967();
         float var14 = 0.010416667F;
         var3.translate(0.0, 0.33333334F, 0.046666667F);
         var3.method35292(0.010416667F, -0.010416667F, 0.010416667F);
         int var15 = var1.method3844().method314();
         if (Config.method26911()) {
            var15 = Class9680.method37900(var15);
         }

         double var16 = 0.4;
         int var18 = (int)((double)Class1806.method7911(var15) * 0.4);
         int var19 = (int)((double)Class1806.method7912(var15) * 0.4);
         int var20 = (int)((double)Class1806.method7913(var15) * 0.4);
         int var21 = Class1806.method7914(0, var20, var19, var18);
         byte var22 = 20;

         for (int var23 = 0; var23 < 4; var23++) {
            Class9125 var24 = var1.method3837(var23, var1x -> {
               List var4x = var13.method38828(var1x, 90);
               return !var4x.isEmpty() ? (Class9125)var4x.get(0) : Class9125.field41930;
            });
            if (var24 != null) {
               float var25 = (float)(-var13.method38822(var24) / 2);
               var13.method38813(var24, var25, (float)(var23 * 10 - 20), var21, false, var3.getLast().getMatrix(), var4, false, 0, var5);
            }
         }
      }

      var3.pop();
   }

   public static Class7826 method18473(Block var0) {
      Class9673 var3;
      if (!(var0 instanceof Class3373)) {
         var3 = Class9673.field45166;
      } else {
         var3 = ((Class3373)var0).method11967();
      }

      return Class8624.method30911(var3);
   }

   private static boolean method18474(Class954 var0) {
      if (! Shaders.isShadowPass) {
         if (!Config.field34162) {
            BlockPos var3 = var0.getPos();
            Entity var4 = Minecraft.getInstance().getRenderViewEntity();
            double var5 = var4.getDistanceNearest((double)var3.getX(), (double)var3.getY(), (double)var3.getZ());
            if (var5 > field25939) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static void method18475() {
      Minecraft var2 = Minecraft.getInstance();
      double var3 = Config.method26833(var2.gameSettings.fov, 1.0, 120.0);
      double var5 = Math.max(1.5 * (double)var2.getMainWindow().getHeight() / var3, 16.0);
      field25939 = var5 * var5;
   }
}
