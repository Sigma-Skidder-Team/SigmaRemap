package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class Class875<T extends Class5823> extends ContainerScreen<T> implements Class876 {
   private static String[] field4850;
   private ResourceLocation field4851;

   public Class875(T var1, PlayerInventory var2, ITextComponent var3, ResourceLocation var4) {
      super((T)var1, var2, var3);
      this.field4851 = var4;
   }

   public void method2716() {
   }

   @Override
   public void init() {
      super.init();
      this.method2716();
      this.field4727.addListener(this);
   }

   @Override
   public void onClose() {
      super.onClose();
      this.field4727.removeListener(this);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      super.render(var1, var2, var3, var4);
      RenderSystem.disableBlend();
      this.method2717(var1, var2, var3, var4);
      this.renderHoveredTooltip(var1, var2, var3);
   }

   public void method2717(MatrixStack var1, int var2, int var3, float var4) {
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(this.field4851);
      int var7 = (this.width - this.xSize) / 2;
      int var8 = (this.height - this.ySize) / 2;
      this.blit(var1, var7, var8, 0, 0, this.xSize, this.ySize);
      this.blit(var1, var7 + 59, var8 + 20, 0, this.ySize + (!this.field4727.getSlot(0).getHasStack() ? 16 : 0), 110, 16);
      if ((this.field4727.getSlot(0).getHasStack() || this.field4727.getSlot(1).getHasStack()) && !this.field4727.getSlot(2).getHasStack()) {
         this.blit(var1, var7 + 99, var8 + 45, this.xSize, 0, 28, 21);
      }
   }

   @Override
   public void method2718(Container var1, NonNullList<ItemStack> var2) {
      this.method2720(var1, 0, var1.getSlot(0).getStack());
   }

   @Override
   public void method2719(Container var1, int var2, int var3) {
   }

   @Override
   public void method2720(Container var1, int var2, ItemStack var3) {
   }
}
