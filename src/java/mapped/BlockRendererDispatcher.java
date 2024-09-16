package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.resources.IResourceManagerReloadListener;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;

import java.util.Random;

public class BlockRendererDispatcher implements IResourceManagerReloadListener {
   private final BlockModelShapes field853;
   private final Class7551 field854;
   private final Class4829 field855;
   private final Random field856 = new Random();
   private final BlockColors field857;

   public BlockRendererDispatcher(BlockModelShapes var1, BlockColors var2) {
      this.field853 = var1;
      this.field857 = var2;
      if (!Class9299.field42820.method20241()) {
         this.field854 = new Class7551(this.field857);
      } else {
         this.field854 = (Class7551)Class9299.method35087(Class9299.field42820, this.field857);
      }

      this.field855 = new Class4829();
   }

   public BlockModelShapes getBlockModelShapes() {
      return this.field853;
   }

   public void method807(BlockState var1, BlockPos var2, IBlockDisplayReader var3, MatrixStack var4, Class5422 var5) {
      this.method808(var1, var2, var3, var4, var5, Class7181.field30863);
   }

   public void method808(BlockState var1, BlockPos var2, IBlockDisplayReader var3, MatrixStack var4, Class5422 var5, Class7180 var6) {
      if (var1.getRenderType() == BlockRenderType.MODEL) {
         IBakedModel var9 = this.field853.method38153(var1);
         long var10 = var1.method23451(var2);
         this.field854.method24680(var3, var9, var1, var2, var4, var5, true, this.field856, var10, Class213.field798, var6);
      }
   }

   public boolean method809(BlockState var1, BlockPos var2, IBlockDisplayReader var3, MatrixStack var4, Class5422 var5, boolean var6, Random var7) {
      return this.method810(var1, var2, var3, var4, var5, var6, var7, Class7181.field30863);
   }

   public boolean method810(BlockState var1, BlockPos var2, IBlockDisplayReader var3, MatrixStack var4, Class5422 var5, boolean var6, Random var7, Class7180 var8) {
      try {
         BlockRenderType var11 = var1.getRenderType();
         return var11 != BlockRenderType.MODEL
            ? false
            : this.field854.method24680(var3, this.method813(var1), var1, var2, var4, var5, var6, var7, var1.method23451(var2), Class213.field798, var8);
      } catch (Throwable var14) {
         CrashReport var12 = CrashReport.makeCrashReport(var14, "Tesselating block in world");
         CrashReportCategory var13 = var12.makeCategory("Block being tesselated");
         CrashReportCategory.addBlockInfo(var13, var2, var1);
         throw new ReportedException(var12);
      }
   }

   public boolean method811(BlockPos var1, IBlockDisplayReader var2, Class5422 var3, FluidState var4) {
      try {
         return this.field855.method14925(var2, var1, var3, var4);
      } catch (Throwable var10) {
         CrashReport var8 = CrashReport.makeCrashReport(var10, "Tesselating liquid in world");
         CrashReportCategory var9 = var8.makeCategory("Block being tesselated");
         CrashReportCategory.addBlockInfo(var9, var1, (BlockState)null);
         throw new ReportedException(var8);
      }
   }

   public Class7551 method812() {
      return this.field854;
   }

   public IBakedModel method813(BlockState var1) {
      return this.field853.method38153(var1);
   }

   public void method814(BlockState var1, MatrixStack var2, Class7733 var3, int var4, int var5) {
      this.method815(var1, var2, var3, var4, var5, Class7181.field30863);
   }

   public void method815(BlockState var1, MatrixStack var2, Class7733 var3, int var4, int var5, Class7180 var6) {
      BlockRenderType var9 = var1.getRenderType();
      if (var9 != BlockRenderType.field9885) {
         switch (Class6624.field29144[var9.ordinal()]) {
            case 1:
               IBakedModel var10 = this.method813(var1);
               int var11 = this.field857.method29465(var1, (IBlockDisplayReader)null, (BlockPos)null, 0);
               float var12 = (float)(var11 >> 16 & 0xFF) / 255.0F;
               float var13 = (float)(var11 >> 8 & 0xFF) / 255.0F;
               float var14 = (float)(var11 & 0xFF) / 255.0F;
               this.field854
                  .method24690(var2.getLast(), var3.method25597(Class8928.method32632(var1, false)), var1, var10, var12, var13, var14, var4, var5, var6);
               break;
            case 2:
               if (Class9299.field42913.method20214()) {
                  ItemStack var15 = new ItemStack(var1.getBlock());
                  Class9809 var16 = (Class9809)Class9299.method35070(var15.getItem(), Class9299.field42913);
                  var16.method38685(var15, Class2327.field15924, var2, var3, var4, var5);
               } else {
                  Class9809.field45844.method38685(new ItemStack(var1.getBlock()), Class2327.field15924, var2, var3, var4, var5);
               }
         }
      }
   }

   @Override
   public void method737(IResourceManager var1) {
      this.field855.method14919();
   }

   public Class1991 method816() {
      return Class1990.field12988;
   }
}
