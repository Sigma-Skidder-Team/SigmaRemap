package net.minecraft.client.gui.screen.inventory;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.*;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class CraftingScreen extends ContainerScreen<Class5829> implements Class854 {
   private static final ResourceLocation field4754 = new ResourceLocation("textures/gui/container/crafting_table.png");
   private static final ResourceLocation field4755 = new ResourceLocation("textures/gui/recipe_button.png");
   private final Class1254 field4756 = new Class1254();
   private boolean field4757;

   public CraftingScreen(Class5829 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, var2, var3);
   }

   @Override
   public void init() {
      super.init();
      this.field4757 = this.width < 379;
      this.field4756.method5833(this.width, this.height, this.mc, this.field4757, this.field4727);
      this.field4734 = this.field4756.method5837(this.field4757, this.width, this.xSize);
      this.children.add(this.field4756);
      this.setFocusedDefault(this.field4756);
      this.<Class1243>addButton(new Class1243(this.field4734 + 5, this.height / 2 - 49, 20, 18, 0, 0, 19, field4755, var1 -> {
         this.field4756.method5834(this.field4757);
         this.field4756.method5838();
         this.field4734 = this.field4756.method5837(this.field4757, this.width, this.xSize);
         ((Class1243)var1).method5819(this.field4734 + 5, this.height / 2 - 49);
      }));
      this.field4723 = 29;
   }

   @Override
   public void tick() {
      super.tick();
      this.field4756.method5844();
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      if (this.field4756.method5839() && this.field4757) {
         this.drawGuiContainerBackgroundLayer(var1, var4, var2, var3);
         this.field4756.render(var1, var2, var3, var4);
      } else {
         this.field4756.render(var1, var2, var3, var4);
         super.render(var1, var2, var3, var4);
         this.field4756.method5850(var1, this.field4734, this.field4735, true, var4);
      }

      this.renderHoveredTooltip(var1, var2, var3);
      this.field4756.method5846(var1, this.field4734, this.field4735, var2, var3);
   }

   @Override
   public void drawGuiContainerBackgroundLayer(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(field4754);
      int var7 = this.field4734;
      int var8 = (this.height - this.ySize) / 2;
      this.blit(var1, var7, var8, 0, 0, this.xSize, this.ySize);
   }

   @Override
   public boolean method2625(int var1, int var2, int var3, int var4, double var5, double var7) {
      return (!this.field4757 || !this.field4756.method5839()) && super.method2625(var1, var2, var3, var4, var5, var7);
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (this.field4756.mouseClicked(var1, var3, var5)) {
         this.setListener(this.field4756);
         return true;
      } else {
         return this.field4757 && this.field4756.method5839() ? true : super.mouseClicked(var1, var3, var5);
      }
   }

   @Override
   public boolean method2623(double var1, double var3, int var5, int var6, int var7) {
      boolean var10 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.xSize) || var3 >= (double)(var6 + this.ySize);
      return this.field4756.method5852(var1, var3, this.field4734, this.field4735, this.xSize, this.ySize, var7) && var10;
   }

   @Override
   public void method2626(Slot var1, int var2, int var3, ClickType var4) {
      super.method2626(var1, var2, var3, var4);
      this.field4756.method5841(var1);
   }

   @Override
   public void method2631() {
      this.field4756.method5856();
   }

   @Override
   public void onClose() {
      this.field4756.method5836();
      super.onClose();
   }

   @Override
   public Class1254 method2632() {
      return this.field4756;
   }
}
