package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.BeaconScreen;
import net.minecraft.client.gui.widget.button.AbstractButton;
import net.minecraft.util.text.StringTextComponent;

public abstract class Class1201 extends AbstractButton {
   private boolean field6499;

   public Class1201(int var1, int var2) {
      super(var1, var2, 22, 22, StringTextComponent.EMPTY);
   }

   @Override
   public void renderButton(MatrixStack var1, int var2, int var3, float var4) {
      Minecraft.getInstance().getTextureManager().bindTexture(BeaconScreen.method2704());
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);

      int var8 = 0;
      if (this.active) {
         if (!this.field6499) {
            if (this.isHovered()) {
               var8 += this.width * 3;
            }
         } else {
            var8 += this.width * 1;
         }
      } else {
         var8 += this.width * 2;
      }

      this.blit(var1, this.x, this.y, var8, 219, this.width, this.height);
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
