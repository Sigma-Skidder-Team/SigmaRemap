package net.minecraft.client.gui.screen.inventory;

import mapped.Class1258;
import mapped.Class5832;
import mapped.Class855;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class FurnaceScreen extends Class855<Class5832> {
   private static final ResourceLocation field4762 = new ResourceLocation("textures/gui/container/furnace.png");

   public FurnaceScreen(Class5832 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, new Class1258(), var2, var3, field4762);
   }
}
