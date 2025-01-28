package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.state.properties.BedPart;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.world.World;

public class Class5950 extends Class5942<Class967> {
   private static String[] field25946;
   private final ModelRenderer field25947;
   private final ModelRenderer field25948;
   private final ModelRenderer[] field25949 = new ModelRenderer[4];

   public Class5950(TileEntityRendererDispatcher var1) {
      super(var1);
      this.field25947 = new ModelRenderer(64, 64, 0, 0);
      this.field25947.addBox(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F, 0.0F);
      this.field25948 = new ModelRenderer(64, 64, 0, 22);
      this.field25948.addBox(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F, 0.0F);
      this.field25949[0] = new ModelRenderer(64, 64, 50, 0);
      this.field25949[1] = new ModelRenderer(64, 64, 50, 6);
      this.field25949[2] = new ModelRenderer(64, 64, 50, 12);
      this.field25949[3] = new ModelRenderer(64, 64, 50, 18);
      this.field25949[0].method22673(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F);
      this.field25949[1].method22673(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F);
      this.field25949[2].method22673(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F);
      this.field25949[3].method22673(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F);
      this.field25949[0].rotateAngleX = (float) (Math.PI / 2);
      this.field25949[1].rotateAngleX = (float) (Math.PI / 2);
      this.field25949[2].rotateAngleX = (float) (Math.PI / 2);
      this.field25949[3].rotateAngleX = (float) (Math.PI / 2);
      this.field25949[0].rotateAngleZ = 0.0F;
      this.field25949[1].rotateAngleZ = (float) (Math.PI / 2);
      this.field25949[2].rotateAngleZ = (float) (Math.PI * 3.0 / 2.0);
      this.field25949[3].rotateAngleZ = (float) Math.PI;
   }

   public void method18462(Class967 var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      Class7826 var9 = Class8624.field38785[var1.method4000().method309()];
      World var10 = var1.method3734();
      if (var10 == null) {
         this.method18480(var3, var4, true, Direction.SOUTH, var9, var5, var6, false);
         this.method18480(var3, var4, false, Direction.SOUTH, var9, var5, var6, true);
      } else {
         BlockState var11 = var1.getBlockState();
         Class7995<Class967> var12 = Class9324.<Class967>method35243(
            TileEntityType.field21444, BedBlock::method11684, BedBlock::method11683, ChestBlock.field18865, var11, var10, var1.getPos(), (var0, var1x) -> false
         );
         int var13 = var12.method27292(new Class6138<>()).get(var5);
         this.method18480(
            var3,
            var4,
            var11.<BedPart>get(BedBlock.PART) == BedPart.HEAD,
            var11.<Direction>get(BedBlock.HORIZONTAL_FACING),
            var9,
            var13,
            var6,
            false
         );
      }
   }

   private void method18480(MatrixStack var1, Class7733 var2, boolean var3, Direction var4, Class7826 var5, int var6, int var7, boolean var8) {
      this.field25947.showModel = var3;
      this.field25948.showModel = !var3;
      this.field25949[0].showModel = !var3;
      this.field25949[1].showModel = var3;
      this.field25949[2].showModel = !var3;
      this.field25949[3].showModel = var3;
      var1.push();
      var1.translate(0.0, 0.5625, !var8 ? 0.0 : -1.0);
      var1.rotate(Vector3f.XP.rotationDegrees(90.0F));
      var1.translate(0.5, 0.5, 0.5);
      var1.rotate(Vector3f.ZP.rotationDegrees(180.0F + var4.getHorizontalAngle()));
      var1.translate(-0.5, -0.5, -0.5);
      IVertexBuilder var11 = var5.method26200(var2, RenderType::getEntitySolid);
      this.field25947.render(var1, var11, var6, var7);
      this.field25948.render(var1, var11, var6, var7);
      this.field25949[0].render(var1, var11, var6, var7);
      this.field25949[1].render(var1, var11, var6, var7);
      this.field25949[2].render(var1, var11, var6, var7);
      this.field25949[3].render(var1, var11, var6, var7);
      var1.pop();
   }
}
