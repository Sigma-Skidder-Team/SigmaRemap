package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1312 extends Screen {
   private static final ITextComponent field6923 = new TranslationTextComponent("multiplayer.downloadingTerrain");
   private Class7156 field6924 = Class8703.method31387();

   public Class1312() {
      super(NarratorChatListener.field29300);
   }

   @Override
   public boolean method2454() {
      return false;
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      if (this.field6924 == null) {
         this.method2471(0);
      } else {
         this.field6924.method22328(this.field4564, this.field4565);
      }

      method5691(var1, this.fontRenderer, field6923, this.field4564 / 2, this.field4565 / 2 - 50, 16777215);
      super.method1923(var1, var2, var3, var4);
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }
}
