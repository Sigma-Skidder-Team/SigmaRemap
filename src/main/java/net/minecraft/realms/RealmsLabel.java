package net.minecraft.realms;

import mapped.IGuiEventListener2;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;

public class RealmsLabel implements IGuiEventListener2 {
   private static String[] field6290;
   private final ITextComponent field6291;
   private final int field6292;
   private final int field6293;
   private final int field6294;

   public RealmsLabel(ITextComponent var1, int var2, int var3, int var4) {
      this.field6291 = var1;
      this.field6292 = var2;
      this.field6293 = var3;
      this.field6294 = var4;
   }

   public void func_239560_a_(Screen var1, MatrixStack var2) {
      Screen.drawCenteredString(var2, Minecraft.getInstance().fontRenderer, this.field6291, this.field6292, this.field6293, this.field6294);
   }

   public String method5543() {
      return this.field6291.getString();
   }
}
