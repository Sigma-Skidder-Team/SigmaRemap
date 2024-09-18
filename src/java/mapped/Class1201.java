package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.StringTextComponent;

public abstract class Class1201 extends Class1200 {
   private boolean field6499;

   public Class1201(int var1, int var2) {
      super(var1, var2, 22, 22, StringTextComponent.EMPTY);
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      Minecraft.getInstance().getTextureManager().bindTexture(Class872.method2704());
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      short var7 = 219;
      int var8 = 0;
      if (this.active) {
         if (!this.field6499) {
            if (this.method5737()) {
               var8 += this.field6475 * 3;
            }
         } else {
            var8 += this.field6475 * 1;
         }
      } else {
         var8 += this.field6475 * 2;
      }

      this.blit(var1, this.field6477, this.field6478, var8, 219, this.field6475, this.field6476);
      this.method5760(var1);
   }

   public abstract void method5760(MatrixStack var1);

   public boolean method5761() {
      return this.field6499;
   }

   public void method5762(boolean var1) {
      this.field6499 = var1;
   }
}
