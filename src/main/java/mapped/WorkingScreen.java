package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class WorkingScreen extends Screen implements Class1339 {
   private ITextComponent field7107;
   private ITextComponent field7108;
   private int field7109;
   private boolean field7110;
   private Class7156 field7111 = Class8703.method31387();

   public WorkingScreen() {
      super(NarratorChatListener.EMPTY);
   }

   @Override
   public boolean shouldCloseOnEsc() {
      return false;
   }

   @Override
   public void displaySavingString(ITextComponent var1) {
      this.method6417(var1);
   }

   @Override
   public void method6417(ITextComponent var1) {
      this.field7107 = var1;
      this.method6418(new TranslationTextComponent("progress.working"));
   }

   @Override
   public void method6418(ITextComponent var1) {
      this.field7108 = var1;
      this.method6419(0);
   }

   @Override
   public void method6419(int var1) {
      this.field7109 = var1;
   }

   @Override
   public void method6420() {
      this.field7110 = true;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      if (!this.field7110) {
         if (this.field7111 != null && this.mc.world == null) {
            this.field7111.method22328(this.width, this.height);
         } else {
            this.renderBackground(var1);
         }

         if (this.field7109 > 0) {
            if (this.field7107 != null) {
               drawCenteredString(var1, this.font, this.field7107, this.width / 2, 70, 16777215);
            }

            if (this.field7108 != null && this.field7109 != 0) {
               drawCenteredString(
                  var1,
                  this.font,
                  new StringTextComponent("").append(this.field7108).appendString(" " + this.field7109 + "%"),
                  this.width / 2,
                  90,
                  16777215
               );
            }
         }

         super.render(var1, var2, var3, var4);
      } else if (!this.mc.isConnectedToRealms()) {
         this.mc.displayGuiScreen((Screen)null);
      }
   }
}
