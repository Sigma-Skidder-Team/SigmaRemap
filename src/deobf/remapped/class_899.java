package remapped;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_899 extends Screen {
   public class_899() {
      super(new StringTextComponent("Out of memory!"));
   }

   @Override
   public void method_1163() {
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155,
            this.field_940 / 4 + 120 + 12,
            150,
            20,
            new TranslationTextComponent("gui.toTitle"),
            var1 -> this.field_943.method_8609(new class_1876())
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155 + 160,
            this.field_940 / 4 + 120 + 12,
            150,
            20,
            new TranslationTextComponent("menu.quit"),
            var1 -> this.field_943.method_8512()
         )
      );
   }

   @Override
   public boolean method_1178() {
      return false;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, this.field_940 / 4 - 60 + 20, 16777215);
      method_9770(var1, this.field_948, "Minecraft has run out of memory.", this.field_941 / 2 - 140, this.field_940 / 4 - 60 + 60 + 0, 10526880);
      method_9770(
         var1, this.field_948, "This could be caused by a bug in the game or by the", this.field_941 / 2 - 140, this.field_940 / 4 - 60 + 60 + 18, 10526880
      );
      method_9770(
         var1, this.field_948, "Java Virtual Machine not being allocated enough", this.field_941 / 2 - 140, this.field_940 / 4 - 60 + 60 + 27, 10526880
      );
      method_9770(var1, this.field_948, "memory.", this.field_941 / 2 - 140, this.field_940 / 4 - 60 + 60 + 36, 10526880);
      method_9770(
         var1, this.field_948, "To prevent level corruption, the current game has quit.", this.field_941 / 2 - 140, this.field_940 / 4 - 60 + 60 + 54, 10526880
      );
      method_9770(
         var1,
         this.field_948,
         "We've tried to free up enough memory to let you go back to",
         this.field_941 / 2 - 140,
         this.field_940 / 4 - 60 + 60 + 63,
         10526880
      );
      method_9770(
         var1,
         this.field_948,
         "the main menu and back to playing, but this may not have worked.",
         this.field_941 / 2 - 140,
         this.field_940 / 4 - 60 + 60 + 72,
         10526880
      );
      method_9770(
         var1, this.field_948, "Please restart the game if you see this message again.", this.field_941 / 2 - 140, this.field_940 / 4 - 60 + 60 + 81, 10526880
      );
      super.method_6767(var1, var2, var3, var4);
   }
}
