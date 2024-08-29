package mapped;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class MemoryErrorScreen extends Screen {
   public MemoryErrorScreen() {
      super(new StringTextComponent("Out of memory!"));
   }

   @Override
   public void method1921() {
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155,
            this.field4565 / 4 + 120 + 12,
            150,
            20,
            new TranslationTextComponent("gui.toTitle"),
            var1 -> this.field4562.displayGuiScreen(new MainMenuScreen())
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155 + 160,
            this.field4565 / 4 + 120 + 12,
            150,
            20,
            new TranslationTextComponent("menu.quit"),
            var1 -> this.field4562.shutdown()
         )
      );
   }

   @Override
   public boolean method2454() {
      return false;
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, this.field4565 / 4 - 60 + 20, 16777215);
      method5692(var1, this.field4568, "Minecraft has run out of memory.", this.field4564 / 2 - 140, this.field4565 / 4 - 60 + 60 + 0, 10526880);
      method5692(
         var1, this.field4568, "This could be caused by a bug in the game or by the", this.field4564 / 2 - 140, this.field4565 / 4 - 60 + 60 + 18, 10526880
      );
      method5692(var1, this.field4568, "Java Virtual Machine not being allocated enough", this.field4564 / 2 - 140, this.field4565 / 4 - 60 + 60 + 27, 10526880);
      method5692(var1, this.field4568, "memory.", this.field4564 / 2 - 140, this.field4565 / 4 - 60 + 60 + 36, 10526880);
      method5692(
         var1, this.field4568, "To prevent level corruption, the current game has quit.", this.field4564 / 2 - 140, this.field4565 / 4 - 60 + 60 + 54, 10526880
      );
      method5692(
         var1,
         this.field4568,
         "We've tried to free up enough memory to let you go back to",
         this.field4564 / 2 - 140,
         this.field4565 / 4 - 60 + 60 + 63,
         10526880
      );
      method5692(
         var1,
         this.field4568,
         "the main menu and back to playing, but this may not have worked.",
         this.field4564 / 2 - 140,
         this.field4565 / 4 - 60 + 60 + 72,
         10526880
      );
      method5692(
         var1, this.field4568, "Please restart the game if you see this message again.", this.field4564 / 2 - 140, this.field4565 / 4 - 60 + 60 + 81, 10526880
      );
      super.method1923(var1, var2, var3, var4);
   }
}
