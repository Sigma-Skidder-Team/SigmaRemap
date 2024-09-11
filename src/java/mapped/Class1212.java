package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class1212 extends Class1210 {
   public Class1212(int var1, int var2, int var3) {
      super(var1, var2, var3, 22, 20, "");
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      if (this.field6483) {
         super.render(var1, var2, var3, var4);
         ResourceLocation var7 = new ResourceLocation("optifine/textures/icons.png");
         Class7944.method26861().bindTexture(var7);
         GlStateManager.method23843(1.0F, 1.0F, 1.0F, 1.0F);
         this.blit(var1, this.field6477 + 3, this.field6478 + 2, 0, 0, 16, 16);
      }
   }
}
