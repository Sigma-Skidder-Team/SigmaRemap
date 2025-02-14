package net.minecraft.client.gui.widget.button;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.text.ITextComponent;

public abstract class AbstractButton extends Widget {
   public AbstractButton(int var1, int var2, int var3, int var4, ITextComponent title) {
      super(var1, var2, var3, var4, title);
   }

   public abstract void onPress();

   public void onClick(double var1, double var3) {
      this.onPress();
   }

   public boolean keyPressed(int var1, int var2, int var3) {
      if (!this.active || !this.visible) {
         return false;
      } else if (var1 != 257 && var1 != 32 && var1 != 335) {
         return false;
      } else {
         this.playDownSound(Minecraft.getInstance().getSoundHandler());
         this.onPress();
         return true;
      }
   }
}
