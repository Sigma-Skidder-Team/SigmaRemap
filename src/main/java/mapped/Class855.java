package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public abstract class Class855<T extends Class5831> extends ContainerScreen<T> implements Class854 {
   private static final ResourceLocation field4758 = new ResourceLocation("textures/gui/recipe_button.png");
   public final Class1255 field4759;
   private boolean field4760;
   private final ResourceLocation field4761;

   public Class855(T var1, Class1255 var2, PlayerInventory var3, ITextComponent var4, ResourceLocation var5) {
      super((T)var1, var3, var4);
      this.field4759 = var2;
      this.field4761 = var5;
   }

   @Override
   public void init() {
      super.init();
      this.field4760 = this.width < 379;
      this.field4759.method5833(this.width, this.height, this.mc, this.field4760, this.field4727);
      this.field4734 = this.field4759.method5837(this.field4760, this.width, this.xSize);
      this.<Class1243>addButton(new Class1243(this.field4734 + 20, this.height / 2 - 49, 20, 18, 0, 0, 19, field4758, var1 -> {
         this.field4759.method5834(this.field4760);
         this.field4759.method5838();
         this.field4734 = this.field4759.method5837(this.field4760, this.width, this.xSize);
         ((Class1243)var1).method5819(this.field4734 + 20, this.height / 2 - 49);
      }));
      this.field4723 = (this.xSize - this.font.method38821(this.title)) / 2;
   }

   @Override
   public void tick() {
      super.tick();
      this.field4759.method5844();
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      if (this.field4759.method5839() && this.field4760) {
         this.drawGuiContainerBackgroundLayer(var1, var4, var2, var3);
         this.field4759.render(var1, var2, var3, var4);
      } else {
         this.field4759.render(var1, var2, var3, var4);
         super.render(var1, var2, var3, var4);
         this.field4759.method5850(var1, this.field4734, this.field4735, true, var4);
      }

      this.renderHoveredTooltip(var1, var2, var3);
      this.field4759.method5846(var1, this.field4734, this.field4735, var2, var3);
   }

   @Override
   public void drawGuiContainerBackgroundLayer(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(this.field4761);
      int var7 = this.field4734;
      int var8 = this.field4735;
      this.blit(var1, var7, var8, 0, 0, this.xSize, this.ySize);
      if (this.field4727.method18238()) {
         int var9 = this.field4727.method18237();
         this.blit(var1, var7 + 56, var8 + 36 + 12 - var9, 176, 12 - var9, 14, var9 + 1);
      }

      int var10 = this.field4727.method18236();
      this.blit(var1, var7 + 79, var8 + 34, 176, 14, var10 + 1, 16);
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (this.field4759.mouseClicked(var1, var3, var5)) {
         return true;
      } else {
         return this.field4760 && this.field4759.method5839() ? true : super.mouseClicked(var1, var3, var5);
      }
   }

   @Override
   public void method2626(Slot var1, int var2, int var3, ClickType var4) {
      super.method2626(var1, var2, var3, var4);
      this.field4759.method5841(var1);
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      return !this.field4759.keyPressed(var1, var2, var3) ? super.keyPressed(var1, var2, var3) : false;
   }

   @Override
   public boolean method2623(double var1, double var3, int var5, int var6, int var7) {
      boolean var10 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.xSize) || var3 >= (double)(var6 + this.ySize);
      return this.field4759.method5852(var1, var3, this.field4734, this.field4735, this.xSize, this.ySize, var7) && var10;
   }

   @Override
   public boolean charTyped(char var1, int var2) {
      return !this.field4759.charTyped(var1, var2) ? super.charTyped(var1, var2) : true;
   }

   @Override
   public void method2631() {
      this.field4759.method5856();
   }

   @Override
   public Class1254 method2632() {
      return this.field4759;
   }

   @Override
   public void onClose() {
      this.field4759.method5836();
      super.onClose();
   }
}
