package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class MemoryErrorScreen extends Screen {
   public MemoryErrorScreen() {
      super(new StringTextComponent("Out of memory!"));
   }

   @Override
   public void init() {
      this.<Button>addButton(
         new Button(
            this.width / 2 - 155,
            this.height / 4 + 120 + 12,
            150,
            20,
            new TranslationTextComponent("gui.toTitle"),
            var1 -> this.mc.displayGuiScreen(new VanillaMainMenuScreen())
         )
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 - 155 + 160,
            this.height / 4 + 120 + 12,
            150,
            20,
            new TranslationTextComponent("menu.quit"),
            var1 -> this.mc.shutdown()
         )
      );
   }

   @Override
   public boolean shouldCloseOnEsc() {
      return false;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.font, this.title, this.width / 2, this.height / 4 - 60 + 20, 16777215);
      drawString(var1, this.font, "Minecraft has run out of memory.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 0, 10526880);
      drawString(
         var1, this.font, "This could be caused by a bug in the game or by the", this.width / 2 - 140, this.height / 4 - 60 + 60 + 18, 10526880
      );
      drawString(var1, this.font, "Java Virtual Machine not being allocated enough", this.width / 2 - 140, this.height / 4 - 60 + 60 + 27, 10526880);
      drawString(var1, this.font, "memory.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 36, 10526880);
      drawString(
         var1, this.font, "To prevent level corruption, the current game has quit.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 54, 10526880
      );
      drawString(
         var1,
         this.font,
         "We've tried to free up enough memory to let you go back to",
         this.width / 2 - 140,
         this.height / 4 - 60 + 60 + 63,
         10526880
      );
      drawString(
         var1,
         this.font,
         "the main menu and back to playing, but this may not have worked.",
         this.width / 2 - 140,
         this.height / 4 - 60 + 60 + 72,
         10526880
      );
      drawString(
         var1, this.font, "Please restart the game if you see this message again.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 81, 10526880
      );
      super.render(var1, var2, var3, var4);
   }
}
