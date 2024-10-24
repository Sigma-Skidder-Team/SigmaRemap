package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.ChestType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.world.World;

import java.util.Calendar;

public class Class5953<T extends TileEntity & Class942> extends Class5942<T> {
   private static String[] field25954;
   private final ModelRenderer field25955;
   private final ModelRenderer field25956;
   private final ModelRenderer field25957;
   private final ModelRenderer field25958;
   private final ModelRenderer field25959;
   private final ModelRenderer field25960;
   private final ModelRenderer field25961;
   private final ModelRenderer field25962;
   private final ModelRenderer field25963;
   private boolean field25964;

   public Class5953(TileEntityRendererDispatcher var1) {
      super(var1);
      Calendar var4 = Calendar.getInstance();
      if (var4.get(2) + 1 == 12 && var4.get(5) >= 24 && var4.get(5) <= 26) {
         this.field25964 = true;
      }

      this.field25956 = new ModelRenderer(64, 64, 0, 19);
      this.field25956.addBox(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F, 0.0F);
      this.field25955 = new ModelRenderer(64, 64, 0, 0);
      this.field25955.addBox(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F, 0.0F);
      this.field25955.rotationPointY = 9.0F;
      this.field25955.rotationPointZ = 1.0F;
      this.field25957 = new ModelRenderer(64, 64, 0, 0);
      this.field25957.addBox(7.0F, -1.0F, 15.0F, 2.0F, 4.0F, 1.0F, 0.0F);
      this.field25957.rotationPointY = 8.0F;
      this.field25959 = new ModelRenderer(64, 64, 0, 19);
      this.field25959.addBox(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F, 0.0F);
      this.field25958 = new ModelRenderer(64, 64, 0, 0);
      this.field25958.addBox(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F, 0.0F);
      this.field25958.rotationPointY = 9.0F;
      this.field25958.rotationPointZ = 1.0F;
      this.field25960 = new ModelRenderer(64, 64, 0, 0);
      this.field25960.addBox(15.0F, -1.0F, 15.0F, 1.0F, 4.0F, 1.0F, 0.0F);
      this.field25960.rotationPointY = 8.0F;
      this.field25962 = new ModelRenderer(64, 64, 0, 19);
      this.field25962.addBox(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F, 0.0F);
      this.field25961 = new ModelRenderer(64, 64, 0, 0);
      this.field25961.addBox(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F, 0.0F);
      this.field25961.rotationPointY = 9.0F;
      this.field25961.rotationPointZ = 1.0F;
      this.field25963 = new ModelRenderer(64, 64, 0, 0);
      this.field25963.addBox(0.0F, -1.0F, 15.0F, 1.0F, 4.0F, 1.0F, 0.0F);
      this.field25963.rotationPointY = 8.0F;
   }

   @Override
   public void method18462(T var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      World var9 = var1.method3734();
      boolean var10 = var9 != null;
      BlockState var11 = !var10 ? Blocks.CHEST.getDefaultState().with(ChestBlock.field18865, Direction.SOUTH) : var1.getBlockState();
      ChestType var12 = !var11.hasProperty(ChestBlock.TYPE) ? ChestType.field379 : var11.<ChestType>get(ChestBlock.TYPE);
      Block var13 = var11.getBlock();
      if (var13 instanceof Class3346) {
         Class3346 var14 = (Class3346)var13;
         boolean var15 = var12 != ChestType.field379;
         var3.push();
         float var16 = var11.<Direction>get(ChestBlock.field18865).getHorizontalAngle();
         var3.translate(0.5, 0.5, 0.5);
         var3.rotate(Vector3f.YP.rotationDegrees(-var16));
         var3.translate(-0.5, -0.5, -0.5);
         Class7995<? extends ChestTileEntity> var17;
         if (!var10) {
            var17 = Class6139::method19041;
         } else {
            var17 = var14.method11904(var11, var9, var1.getPos(), true);
         }

         float var18 = var17.method27292(ChestBlock.method11912((Class942)var1)).get(var2);
         var18 = 1.0F - var18;
         var18 = 1.0F - var18 * var18 * var18;
         int var19 = var17.method27292(new Class6138<>()).applyAsInt(var5);
         Class7826 var20 = Class8624.method30913(var1, var12, this.field25964);
         IVertexBuilder var21 = var20.method26200(var4, RenderType::getEntityCutout);
         if (!var15) {
            this.method18486(var3, var21, this.field25955, this.field25957, this.field25956, var18, var19, var6);
         } else if (var12 != ChestType.LEFT) {
            this.method18486(var3, var21, this.field25958, this.field25960, this.field25959, var18, var19, var6);
         } else {
            this.method18486(var3, var21, this.field25961, this.field25963, this.field25962, var18, var19, var6);
         }

         var3.pop();
      }
   }

   private void method18486(MatrixStack var1, IVertexBuilder var2, ModelRenderer var3, ModelRenderer var4, ModelRenderer var5, float var6, int var7, int var8) {
      var3.rotateAngleX = -(var6 * (float) (Math.PI / 2));
      var4.rotateAngleX = var3.rotateAngleX;
      var3.render(var1, var2, var7, var8);
      var4.render(var1, var2, var7, var8);
      var5.render(var1, var2, var7, var8);
   }
}
