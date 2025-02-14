package net.minecraft.client.gui.screen.inventory;

import mapped.Class1256;
import mapped.Class5834;
import mapped.Class855;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class BlastFurnaceScreen extends Class855<Class5834> {
   private static final ResourceLocation field4763 = new ResourceLocation("textures/gui/container/blast_furnace.png");

   public BlastFurnaceScreen(Class5834 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, new Class1256(), var2, var3, field4763);
   }
}
