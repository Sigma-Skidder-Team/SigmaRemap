package net.minecraft.client.gui.screen.inventory;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.Class5825;
import mapped.Class875;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class SmithingTableScreen extends Class875<Class5825> {
   private static final ResourceLocation field6157 = new ResourceLocation("textures/gui/container/smithing.png");

   public SmithingTableScreen(Class5825 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, var2, var3, field6157);
      this.field4723 = 60;
      this.field4724 = 18;
   }

   @Override
   public void method2617(MatrixStack var1, int var2, int var3) {
      RenderSystem.disableBlend();
      super.method2617(var1, var2, var3);
   }
}
