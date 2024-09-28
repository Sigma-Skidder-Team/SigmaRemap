package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.state.properties.PistonType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Class5945 extends Class5942<Class955> {
   private static String[] field25934;
   private final BlockRendererDispatcher field25935 = Minecraft.getInstance().getBlockRendererDispatcher();

   public Class5945(TileEntityRendererDispatcher var1) {
      super(var1);
   }

   public void method18462(Class955 var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      World var9 = var1.method3734();
      if (var9 != null) {
         BlockPos var10 = var1.getPos().method8349(var1.method3860().getOpposite());
         BlockState var11 = var1.method3864();
         if (!var11.isAir()) {
            Class7551.method24692();
            var3.push();
            var3.translate((double)var1.method3850(var2), (double)var1.method3851(var2), (double)var1.method3852(var2));
            if (var11.isIn(Blocks.PISTON_HEAD) && var1.method3849(var2) <= 4.0F) {
               var11 = var11.with(Class3436.field19212, Boolean.valueOf(var1.method3849(var2) <= 0.5F));
               this.method18467(var10, var11, var3, var4, var9, false, var6);
            } else if (var1.method3848() && !var1.method3846()) {
               PistonType var12 = !var11.isIn(Blocks.STICKY_PISTON) ? PistonType.field638 : PistonType.field639;
               BlockState var13 = Blocks.PISTON_HEAD
                  .method11579()
                  .with(Class3436.field19211, var12)
                  .with(Class3436.field19198, var11.<Direction>get(Class3435.field19198));
               var13 = var13.with(Class3436.field19212, Boolean.valueOf(var1.method3849(var2) >= 0.5F));
               this.method18467(var10, var13, var3, var4, var9, false, var6);
               BlockPos var14 = var10.method8349(var1.method3860());
               var3.pop();
               var3.push();
               var11 = var11.with(Class3435.field19202, Boolean.valueOf(true));
               this.method18467(var14, var11, var3, var4, var9, true, var6);
            } else {
               this.method18467(var10, var11, var3, var4, var9, false, var6);
            }

            var3.pop();
            Class7551.method24693();
         }
      }
   }

   private void method18467(BlockPos var1, BlockState var2, MatrixStack var3, Class7733 var4, World var5, boolean var6, int var7) {
      RenderType var10 = Class8928.method32631(var2);
      IVertexBuilder var11 = var4.method25597(var10);
      this.field25935.method812().method24679(var5, this.field25935.method813(var2), var2, var1, var3, var11, var6, new Random(), var2.method23451(var1), var7);
   }
}
