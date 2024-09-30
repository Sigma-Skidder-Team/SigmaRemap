package net.minecraft.client.gui.screen.inventory;

import mapped.Class1257;
import mapped.Class5833;
import mapped.Class855;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class SmokerScreen extends Class855<Class5833> {
   private static final ResourceLocation field4764 = new ResourceLocation("textures/gui/container/smoker.png");

   public SmokerScreen(Class5833 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, new Class1257(), var2, var3, field4764);
   }
}
