package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class ConfirmBackupScreen extends Screen {
   private final Screen field6941;
   public final Class7977 field6942;
   private final ITextComponent field6943;
   private final boolean field6944;
   private Class5991 field6945 = Class5991.field26162;
   private Class1248 field6946;

   public ConfirmBackupScreen(Screen var1, Class7977 var2, ITextComponent var3, ITextComponent var4, boolean var5) {
      super(var3);
      this.field6941 = var1;
      this.field6942 = var2;
      this.field6943 = var4;
      this.field6944 = var5;
   }

   @Override
   public void init() {
      super.init();
      this.field6945 = Class5991.method18584(this.fontRenderer, this.field6943, this.width - 50);
      int var3 = (this.field6945.method18592() + 1) * 9;
      this.<Button>addButton(
         new Button(
            this.width / 2 - 155,
            100 + var3,
            150,
            20,
            new TranslationTextComponent("selectWorld.backupJoinConfirmButton"),
            var1 -> this.field6942.method27112(true, this.field6946.method5820())
         )
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 - 155 + 160,
            100 + var3,
            150,
            20,
            new TranslationTextComponent("selectWorld.backupJoinSkipButton"),
            var1 -> this.field6942.method27112(false, this.field6946.method5820())
         )
      );
      this.<Button>addButton(
         new Button(this.width / 2 - 155 + 80, 124 + var3, 150, 20, DialogTexts.GUI_CANCEL, var1 -> this.mc.displayGuiScreen(this.field6941))
      );
      this.field6946 = new Class1248(this.width / 2 - 155 + 80, 76 + var3, 150, 20, new TranslationTextComponent("selectWorld.backupEraseCache"), false);
      if (this.field6944) {
         this.<Class1248>addButton(this.field6946);
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 50, 16777215);
      this.field6945.method18588(var1, this.width / 2, 70);
      super.render(var1, var2, var3, var4);
   }

   @Override
   public boolean method2454() {
      return false;
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.keyPressed(var1, var2, var3);
      } else {
         this.mc.displayGuiScreen(this.field6941);
         return true;
      }
   }
}
