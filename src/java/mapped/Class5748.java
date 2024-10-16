package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class Class5748 extends Class5651<Class1054, Class2827<Class1054>> {
   private static final ResourceLocation field25172 = new ResourceLocation("textures/entity/fish/pufferfish.png");
   private int field25173;
   private final Class2885<Class1054> field25174 = new Class2885<Class1054>();
   private final Class2877<Class1054> field25175 = new Class2877<Class1054>();
   private final Class2812<Class1054> field25176 = new Class2812<Class1054>();

   public Class5748(EntityRendererManager var1) {
      super(var1, new Class2812<Class1054>(), 0.2F);
      this.field25173 = 3;
   }

   public ResourceLocation method17843(Class1054 var1) {
      return field25172;
   }

   public void render(Class1054 entityIn, float var2, float partialTicks, MatrixStack matrixStackIn, Class7733 var5, int var6) {
      int var9 = entityIn.method4828();
      if (var9 != this.field25173) {
         if (var9 != 0) {
            if (var9 != 1) {
               this.entityModel = this.field25176;
            } else {
               this.entityModel = this.field25175;
            }
         } else {
            this.entityModel = this.field25174;
         }
      }

      this.field25173 = var9;
      this.shadowSize = 0.1F + 0.1F * (float)var9;
      super.render(entityIn, var2, partialTicks, matrixStackIn, var5, var6);
   }

   public void method17842(Class1054 var1, MatrixStack var2, float var3, float var4, float var5) {
      var2.translate(0.0, (double)(MathHelper.cos(var3 * 0.05F) * 0.08F), 0.0);
      super.method17842(var1, var2, var3, var4, var5);
   }
}
