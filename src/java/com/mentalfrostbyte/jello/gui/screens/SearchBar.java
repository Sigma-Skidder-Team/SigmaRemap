package com.mentalfrostbyte.jello.gui.screens;

import com.mentalfrostbyte.jello.gui.Screen;
import mapped.Class4257;
import net.minecraft.client.Minecraft;

public class SearchBar extends Screen {
   private static Minecraft field21107 = Minecraft.getInstance();
   public Class4257 field21108;

   public SearchBar() {
      super("Spotlight");
      this.method13300(false);
      int var3 = (this.getWidthA() - 675) / 2;
      this.addToList(this.field21108 = new Class4257(this, "search", var3, (int)((float)this.heightA * 0.25F), 675, 60, true));
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      if (var1 == 256) {
         field21107.displayGuiScreen(null);
      }
   }
}
