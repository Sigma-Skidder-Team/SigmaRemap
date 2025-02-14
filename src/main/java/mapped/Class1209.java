package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.StringTextComponent;

public class Class1209 extends Button {
   private static String[] field6511;
   private final boolean field6521;
   private final boolean field6522;

   public Class1209(int var1, int var2, boolean var3, IPressable var4, boolean var5) {
      super(var1, var2, 23, 13, StringTextComponent.EMPTY, var4);
      this.field6521 = var3;
      this.field6522 = var5;
   }

   @Override
   public void renderButton(MatrixStack var1, int var2, int var3, float var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      Minecraft.getInstance().getTextureManager().bindTexture(Class870.field4820);
      int var7 = 0;
      int var8 = 192;
      if (this.isHovered()) {
         var7 += 23;
      }

      if (!this.field6521) {
         var8 += 13;
      }

      this.blit(var1, this.x, this.y, var7, var8, 23, 13);
   }

   @Override
   public void playDownSound(SoundHandler var1) {
      if (this.field6522) {
         var1.play(SimpleSound.master(SoundEvents.field26414, 1.0F));
      }
   }
}
