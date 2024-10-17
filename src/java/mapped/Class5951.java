package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class Class5951 extends Class5942<Class934> {
   public static final Class7826 field25950 = new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, new ResourceLocation("entity/enchanting_table_book"));
   private final Class2850 field25951 = new Class2850();

   public Class5951(TileEntityRendererDispatcher var1) {
      super(var1);
   }

   public void method18462(Class934 var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      var3.push();
      var3.translate(0.5, 0.75, 0.5);
      float var9 = (float)var1.field5281 + var2;
      var3.translate(0.0, (double)(0.1F + MathHelper.sin(var9 * 0.1F) * 0.01F), 0.0);
      float var10 = var1.field5288 - var1.field5289;

      while (var10 >= (float) Math.PI) {
         var10 -= (float) (Math.PI * 2);
      }

      while (var10 < (float) -Math.PI) {
         var10 += (float) (Math.PI * 2);
      }

      float var11 = var1.field5289 + var10 * var2;
      var3.rotate(Vector3f.YP.method25285(-var11));
      var3.rotate(Vector3f.ZP.rotationDegrees(80.0F));
      float var12 = MathHelper.lerp(var2, var1.field5283, var1.field5282);
      float var13 = MathHelper.method37807(var12 + 0.25F) * 1.6F - 0.3F;
      float var14 = MathHelper.method37807(var12 + 0.75F) * 1.6F - 0.3F;
      float var15 = MathHelper.lerp(var2, var1.field5287, var1.field5286);
      this.field25951.method11177(var9, MathHelper.clamp(var13, 0.0F, 1.0F), MathHelper.clamp(var14, 0.0F, 1.0F), var15);
      IVertexBuilder var16 = field25950.method26200(var4, RenderType::getEntitySolid);
      this.field25951.method11176(var3, var16, var5, var6, 1.0F, 1.0F, 1.0F, 1.0F);
      var3.pop();
   }
}
