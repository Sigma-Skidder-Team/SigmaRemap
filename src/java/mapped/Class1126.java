package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class Class1126 extends ContainerScreen<Class5815> {
   private static final ResourceLocation field6165 = new ResourceLocation("textures/gui/container/grindstone.png");

   public Class1126(Class5815 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, var2, var3);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.method2618(var1, var4, var2, var3);
      super.render(var1, var2, var3, var4);
      this.renderHoveredTooltip(var1, var2, var3);
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(field6165);
      int var7 = (this.width - this.xSize) / 2;
      int var8 = (this.height - this.ySize) / 2;
      this.blit(var1, var7, var8, 0, 0, this.xSize, this.ySize);
      if ((this.field4727.getSlot(0).getHasStack() || this.field4727.getSlot(1).getHasStack()) && !this.field4727.getSlot(2).getHasStack()) {
         this.blit(var1, var7 + 92, var8 + 31, this.xSize, 0, 28, 21);
      }
   }
}
