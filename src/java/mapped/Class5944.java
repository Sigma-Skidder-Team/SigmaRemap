package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class Class5944 extends Class5942<Class966> {
   public static final Class7826 field25932 = new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, new ResourceLocation("entity/bell/bell_body"));
   private final Class7219 field25933 = new Class7219(32, 32, 0, 0);

   public Class5944(TileEntityRendererDispatcher var1) {
      super(var1);
      this.field25933.method22673(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F);
      this.field25933.method22679(8.0F, 12.0F, 8.0F);
      Class7219 var4 = new Class7219(32, 32, 0, 13);
      var4.method22673(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F);
      var4.method22679(-8.0F, -12.0F, -8.0F);
      this.field25933.method22670(var4);
   }

   public void method18462(Class966 var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      float var9 = (float)var1.field5416 + var2;
      float var10 = 0.0F;
      float var11 = 0.0F;
      if (var1.field5417) {
         float var12 = MathHelper.sin(var9 / (float) Math.PI) / (4.0F + var9 / 3.0F);
         if (var1.field5418 != Direction.NORTH) {
            if (var1.field5418 != Direction.SOUTH) {
               if (var1.field5418 != Direction.EAST) {
                  if (var1.field5418 == Direction.WEST) {
                     var11 = var12;
                  }
               } else {
                  var11 = -var12;
               }
            } else {
               var10 = var12;
            }
         } else {
            var10 = -var12;
         }
      }

      this.field25933.field31035 = var10;
      this.field25933.field31037 = var11;
      Class5422 var13 = field25932.method26200(var4, RenderType::getEntitySolid);
      this.field25933.method22680(var3, var13, var5, var6);
   }
}
