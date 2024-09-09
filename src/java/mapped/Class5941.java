package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class5941 extends Class5942<Class964> {
   private static String[] field25927;

   public Class5941(TileEntityRendererDispatcher var1) {
      super(var1);
   }

   public void method18462(Class964 var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      if (Minecraft.getInstance().player.canUseCommandBlock() || Minecraft.getInstance().player.isSpectator()) {
         BlockPos var9 = var1.method3940();
         BlockPos var10 = var1.method3942();
         if (var10.getX() >= 1
            && var10.getY() >= 1
            && var10.getZ() >= 1
            && (var1.method3950() == Class104.field318 || var1.method3950() == Class104.field319)) {
            double var11 = (double)var9.getX();
            double var13 = (double)var9.getZ();
            double var15 = (double)var9.getY();
            double var17 = var15 + (double)var10.getY();
            double var19;
            double var21;
            switch (Class7799.field33493[var1.method3944().ordinal()]) {
               case 1:
                  var19 = (double)var10.getX();
                  var21 = (double)(-var10.getZ());
                  break;
               case 2:
                  var19 = (double)(-var10.getX());
                  var21 = (double)var10.getZ();
                  break;
               default:
                  var19 = (double)var10.getX();
                  var21 = (double)var10.getZ();
            }

            double var23;
            double var25;
            double var27;
            double var29;
            switch (Class7799.field33494[var1.method3946().ordinal()]) {
               case 1:
                  var23 = var21 < 0.0 ? var11 : var11 + 1.0;
                  var25 = var19 < 0.0 ? var13 + 1.0 : var13;
                  var27 = var23 - var21;
                  var29 = var25 + var19;
                  break;
               case 2:
                  var23 = var19 < 0.0 ? var11 : var11 + 1.0;
                  var25 = var21 < 0.0 ? var13 : var13 + 1.0;
                  var27 = var23 - var19;
                  var29 = var25 - var21;
                  break;
               case 3:
                  var23 = var21 < 0.0 ? var11 + 1.0 : var11;
                  var25 = var19 < 0.0 ? var13 : var13 + 1.0;
                  var27 = var23 + var21;
                  var29 = var25 - var19;
                  break;
               default:
                  var23 = var19 < 0.0 ? var11 + 1.0 : var11;
                  var25 = var21 < 0.0 ? var13 + 1.0 : var13;
                  var27 = var23 + var19;
                  var29 = var25 + var21;
            }

            float var31 = 1.0F;
            float var32 = 0.9F;
            float var33 = 0.5F;
            Class5422 var34 = var4.method25597(RenderType.method14345());
            if (var1.method3950() == Class104.field318 || var1.method3975()) {
               WorldRenderer.method899(var3, var34, var23, var15, var25, var27, var17, var29, 0.9F, 0.9F, 0.9F, 1.0F, 0.5F, 0.5F, 0.5F);
            }

            if (var1.method3950() == Class104.field318 && var1.method3973()) {
               this.method18459(var1, var34, var9, true, var3);
               this.method18459(var1, var34, var9, false, var3);
            }
         }
      }
   }

   private void method18459(Class964 var1, Class5422 var2, BlockPos var3, boolean var4, MatrixStack var5) {
      World var8 = var1.method3734();
      BlockPos var9 = var1.getPos();
      BlockPos var10 = var9.method8337(var3);

      for (BlockPos var12 : BlockPos.method8359(var10, var10.method8337(var1.method3942()).method8336(-1, -1, -1))) {
         BlockState var13 = var8.getBlockState(var12);
         boolean var14 = var13.isAir();
         boolean var15 = var13.isIn(Blocks.field36894);
         if (var14 || var15) {
            float var16 = !var14 ? 0.0F : 0.05F;
            double var17 = (double)((float)(var12.getX() - var9.getX()) + 0.45F - var16);
            double var19 = (double)((float)(var12.getY() - var9.getY()) + 0.45F - var16);
            double var21 = (double)((float)(var12.getZ() - var9.getZ()) + 0.45F - var16);
            double var23 = (double)((float)(var12.getX() - var9.getX()) + 0.55F + var16);
            double var25 = (double)((float)(var12.getY() - var9.getY()) + 0.55F + var16);
            double var27 = (double)((float)(var12.getZ() - var9.getZ()) + 0.55F + var16);
            if (!var4) {
               if (!var14) {
                  WorldRenderer.method899(var5, var2, var17, var19, var21, var23, var25, var27, 1.0F, 0.25F, 0.25F, 1.0F, 1.0F, 0.25F, 0.25F);
               } else {
                  WorldRenderer.method899(var5, var2, var17, var19, var21, var23, var25, var27, 0.5F, 0.5F, 1.0F, 1.0F, 0.5F, 0.5F, 1.0F);
               }
            } else {
               WorldRenderer.method899(var5, var2, var17, var19, var21, var23, var25, var27, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            }
         }
      }
   }

   public boolean method18461(Class964 var1) {
      return true;
   }
}
