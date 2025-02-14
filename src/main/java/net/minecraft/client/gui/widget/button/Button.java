package net.minecraft.client.gui.widget.button;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.text.ITextComponent;

public class Button extends AbstractButton {
   public static final ITooltip field_238486_s_ = (button, matrixStack, mouseX, mouseY) -> {
   };
   public IPressable onPress;
   public final ITooltip onTooltip;

   public Button(int var1, int var2, int var3, int var4, ITextComponent var5, IPressable var6) {
      this(var1, var2, var3, var4, var5, var6, field_238486_s_);
   }

   public Button(int var1, int var2, int var3, int var4, ITextComponent var5, IPressable var6, ITooltip var7) {
      super(var1, var2, var3, var4, var5);
      this.onPress = var6;
      this.onTooltip = var7;
   }

   public void onPress() {
      this.onPress.onPress(this);
   }

   public void renderButton(MatrixStack var1, int var2, int var3, float var4) {
      super.renderButton(var1, var2, var3, var4);
      if (this.isHovered()) {
         this.renderToolTip(var1, var2, var3);
      }
   }

   public void renderToolTip(MatrixStack var1, int var2, int var3) {
      this.onTooltip.onTooltip(this, var1, var2, var3);
   }

   public static interface ITooltip {
      void onTooltip(Button var1, MatrixStack var2, int var3, int var4);
   }

   public static interface IPressable {
      void onPress(Button var1);
   }
}
