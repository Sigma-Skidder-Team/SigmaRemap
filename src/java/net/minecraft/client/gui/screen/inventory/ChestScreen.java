package net.minecraft.client.gui.screen.inventory;

import com.mojang.blaze3d.matrix.MatrixStack;
import mapped.*;
import net.minecraft.client.gui.IHasContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class ChestScreen extends ContainerScreen<ChestContainer> implements IHasContainer<ChestContainer> {
   private static final ResourceLocation CHEST_GUI_TEXTURE = new ResourceLocation("textures/gui/container/generic_54.png");
   private final int inventoryRows;

   public ChestScreen(ChestContainer var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, var2, var3);
      this.passEvents = false;
      short var6 = 222;
      byte var7 = 114;
      this.inventoryRows = var1.method18165();
      this.ySize = 114 + this.inventoryRows * 18;
      this.playerInventoryTitleY = this.ySize - 94;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      super.render(var1, var2, var3, var4);
      this.renderHoveredTooltip(var1, var2, var3);
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(CHEST_GUI_TEXTURE);
      int var7 = (this.width - this.xSize) / 2;
      int var8 = (this.height - this.ySize) / 2;
      this.blit(var1, var7, var8, 0, 0, this.xSize, this.inventoryRows * 18 + 17);
      this.blit(var1, var7, var8 + this.inventoryRows * 18 + 17, 0, 126, this.xSize, 96);
   }
}
