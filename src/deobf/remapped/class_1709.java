package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1709 extends class_3259 {
   private static final ITextComponent field_8842 = new StringTextComponent("(")
      .append(new TranslationTextComponent("options.languageWarning"))
      .appendString(")")
      .mergeStyle(TextFormatting.GRAY);
   private class_2060 field_8845;
   private final class_2435 field_8843;
   private class_2116 field_8846;
   private class_9521 field_8847;

   public class_1709(Screen var1, class_8881 var2, class_2435 var3) {
      super(var1, var2, new TranslationTextComponent("options.language"));
      this.field_8843 = var3;
   }

   @Override
   public void method_1163() {
      this.field_8845 = new class_2060(this, this.field_943);
      this.field_942.add(this.field_8845);
      this.field_8846 = this.<class_2116>method_1186(
         new class_2116(
            this.field_941 / 2 - 155, this.field_940 - 38, 150, 20, class_1013.field_5306, class_1013.field_5306.method_22128(this.field_16164), var1 -> {
               class_1013.field_5306.method_22127(this.field_16164);
               this.field_16164.method_40873();
               var1.method_32687(class_1013.field_5306.method_22128(this.field_16164));
               this.field_943.method_32777();
            }
         )
      );
      this.field_8847 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 155 + 160, this.field_940 - 38, 150, 20, class_1402.field_7625, var1 -> {
            class_1127 var4 = this.field_8845.method_36226();
            if (var4 != null && !class_1127.method_4957(var4).getCode().equals(this.field_8843.method_11096().getCode())) {
               this.field_8843.method_11097(class_1127.method_4957(var4));
               this.field_16164.field_45437 = class_1127.method_4957(var4).getCode();
               this.field_943.method_8524();
               this.field_8847.method_32687(class_1402.field_7625);
               this.field_8846.method_32687(class_1013.field_5306.method_22128(this.field_16164));
               this.field_16164.method_40873();
            }

            this.field_943.method_8609(this.field_16162);
         })
      );
      super.method_1163();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.field_8845.method_6767(var1, var2, var3, var4);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 16, 16777215);
      method_9788(var1, this.field_948, field_8842, this.field_941 / 2, this.field_940 - 56, 8421504);
      super.method_6767(var1, var2, var3, var4);
   }
}
