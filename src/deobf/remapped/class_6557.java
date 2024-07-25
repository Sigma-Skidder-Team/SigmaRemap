package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6557 extends Screen {
   private final Screen field_33426;
   private static final ITextComponent field_33423 = new TranslationTextComponent("multiplayerWarning.header").mergeStyle(TextFormatting.BOLD);
   private static final ITextComponent field_33422 = new TranslationTextComponent("multiplayerWarning.message");
   private static final ITextComponent field_33419 = new TranslationTextComponent("multiplayerWarning.check");
   private static final ITextComponent field_33421 = field_33423.deepCopy().appendString("\n").append(field_33422);
   private class_8387 field_33420;
   private class_416 field_33425 = class_416.field_1766;

   public class_6557(Screen var1) {
      super(class_7542.field_38486);
      this.field_33426 = var1;
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_33425 = class_416.method_2075(this.field_948, field_33422, this.field_941 - 50);
      int var3 = (this.field_33425.method_2072() + 1) * 9 * 2;
      this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 155, 100 + var3, 150, 20, class_1402.field_7631, var1 -> {
         if (this.field_33420.method_38643()) {
            this.field_943.field_9577.field_45481 = true;
            this.field_943.field_9577.method_40873();
         }

         this.field_943.method_8609(new class_4145(this.field_33426));
      }));
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 155 + 160, 100 + var3, 150, 20, class_1402.field_7632, var1 -> this.field_943.method_8609(this.field_33426))
      );
      this.field_33420 = new class_8387(this.field_941 / 2 - 155 + 80, 76 + var3, 150, 20, field_33419, false);
      this.<class_8387>method_1186(this.field_33420);
   }

   @Override
   public String method_1165() {
      return field_33421.getString();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1170(0);
      method_9771(var1, this.field_948, field_33423, 25, 30, 16777215);
      this.field_33425.method_2074(var1, 25, 70, 18, 16777215);
      super.method_6767(var1, var2, var3, var4);
   }
}
