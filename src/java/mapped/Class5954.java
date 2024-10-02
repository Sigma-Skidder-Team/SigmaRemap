package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;

public class Class5954 extends Class5942<Class940> {
   private static String[] field25965;
   private final Class2887<?> field25966;

   public Class5954(Class2887<?> var1, TileEntityRendererDispatcher var2) {
      super(var2);
      this.field25966 = var1;
   }

   public void method18462(Class940 var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      Direction var9 = Direction.UP;
      if (var1.method3770()) {
         BlockState var10 = var1.method3734().getBlockState(var1.getPos());
         if (var10.getBlock() instanceof Class3368) {
            var9 = var10.<Direction>get(Class3368.field18939);
         }
      }

      Class112 var14 = var1.method3756();
      Class7826 var11;
      if (var14 != null) {
         var11 = Class8624.field38783.get(var14.method309());
      } else {
         var11 = Class8624.field38782;
      }

      var3.push();
      var3.translate(0.5, 0.5, 0.5);
      float var12 = 0.9995F;
      var3.scale(0.9995F, 0.9995F, 0.9995F);
      var3.rotate(var9.method532());
      var3.scale(1.0F, -1.0F, -1.0F);
      var3.translate(0.0, -1.0, 0.0);
      IVertexBuilder var13 = var11.method26200(var4, RenderType::getEntityCutoutNoCull);
      this.field25966.method11202().render(var3, var13, var5, var6);
      var3.translate(0.0, (double)(-var1.method3755(var2) * 0.5F), 0.0);
      var3.rotate(Vector3f.YP.rotationDegrees(270.0F * var1.method3755(var2)));
      this.field25966.method11203().render(var3, var13, var5, var6);
      var3.pop();
   }
}
