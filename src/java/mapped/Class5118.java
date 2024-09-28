package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class5118 implements Class5119 {
   private static String[] field23288;
   private final Minecraft field23289;

   public Class5118(Minecraft var1) {
      this.field23289 = var1;
   }

   @Override
   public void method15813(MatrixStack var1, Class7733 var2, double var3, double var5, double var7) {
      World var11 = this.field23289.player.world;
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.lineWidth(2.0F);
      RenderSystem.disableTexture();
      RenderSystem.depthMask(false);
      BlockPos var12 = new BlockPos(var3, var5, var7);

      for (BlockPos var14 : BlockPos.method8359(var12.method8336(-6, -6, -6), var12.method8336(6, 6, 6))) {
         BlockState var15 = var11.getBlockState(var14);
         if (!var15.isIn(Blocks.AIR)) {
            VoxelShape var16 = var15.method23412(var11, var14);

            for (AxisAlignedBB var18 : var16.method19521()) {
               AxisAlignedBB var19 = var18.method19668(var14).method19664(0.002).offset(-var3, -var5, -var7);
               double var20 = var19.minX;
               double var22 = var19.minY;
               double var24 = var19.minZ;
               double var26 = var19.maxX;
               double var28 = var19.maxY;
               double var30 = var19.maxZ;
               float var32 = 1.0F;
               float var33 = 0.0F;
               float var34 = 0.0F;
               float var35 = 0.5F;
               if (var15.method23454(var11, var14, Direction.WEST)) {
                  Tessellator var36 = Tessellator.getInstance();
                  BufferBuilder var37 = var36.getBuffer();
                  var37.begin(5, DefaultVertexFormats.POSITION_COLOR);
                  var37.pos(var20, var22, var24).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var37.pos(var20, var22, var30).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var37.pos(var20, var28, var24).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var37.pos(var20, var28, var30).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var36.draw();
               }

               if (var15.method23454(var11, var14, Direction.SOUTH)) {
                  Tessellator var38 = Tessellator.getInstance();
                  BufferBuilder var43 = var38.getBuffer();
                  var43.begin(5, DefaultVertexFormats.POSITION_COLOR);
                  var43.pos(var20, var28, var30).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var43.pos(var20, var22, var30).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var43.pos(var26, var28, var30).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var43.pos(var26, var22, var30).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var38.draw();
               }

               if (var15.method23454(var11, var14, Direction.EAST)) {
                  Tessellator var39 = Tessellator.getInstance();
                  BufferBuilder var44 = var39.getBuffer();
                  var44.begin(5, DefaultVertexFormats.POSITION_COLOR);
                  var44.pos(var26, var22, var30).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var44.pos(var26, var22, var24).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var44.pos(var26, var28, var30).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var44.pos(var26, var28, var24).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var39.draw();
               }

               if (var15.method23454(var11, var14, Direction.NORTH)) {
                  Tessellator var40 = Tessellator.getInstance();
                  BufferBuilder var45 = var40.getBuffer();
                  var45.begin(5, DefaultVertexFormats.POSITION_COLOR);
                  var45.pos(var26, var28, var24).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var45.pos(var26, var22, var24).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var45.pos(var20, var28, var24).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var45.pos(var20, var22, var24).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var40.draw();
               }

               if (var15.method23454(var11, var14, Direction.DOWN)) {
                  Tessellator var41 = Tessellator.getInstance();
                  BufferBuilder var46 = var41.getBuffer();
                  var46.begin(5, DefaultVertexFormats.POSITION_COLOR);
                  var46.pos(var20, var22, var24).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var46.pos(var26, var22, var24).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var46.pos(var20, var22, var30).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var46.pos(var26, var22, var30).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var41.draw();
               }

               if (var15.method23454(var11, var14, Direction.UP)) {
                  Tessellator var42 = Tessellator.getInstance();
                  BufferBuilder var47 = var42.getBuffer();
                  var47.begin(5, DefaultVertexFormats.POSITION_COLOR);
                  var47.pos(var20, var28, var24).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var47.pos(var20, var28, var30).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var47.pos(var26, var28, var24).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var47.pos(var26, var28, var30).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
                  var42.draw();
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }
}
