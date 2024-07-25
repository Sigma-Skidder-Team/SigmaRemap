package remapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_260 extends class_9640 {
   private final ITextComponent field_912;
   private final ITextComponent field_911;
   private final String field_913;
   private final boolean field_910;

   public class_260(BooleanConsumer var1, String var2, boolean var3) {
      super(var1, new TranslationTextComponent(!var3 ? "chat.link.confirm" : "chat.link.confirmTrusted"), new StringTextComponent(var2));
      this.field_49114 = (ITextComponent)(!var3 ? class_1402.field_7626 : new TranslationTextComponent("chat.link.open"));
      this.field_49115 = !var3 ? class_1402.field_7628 : class_1402.field_7633;
      this.field_911 = new TranslationTextComponent("chat.copy");
      this.field_912 = new TranslationTextComponent("chat.link.warning");
      this.field_910 = !var3;
      this.field_913 = var2;
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_950.clear();
      this.field_942.clear();
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 50 - 105, this.field_940 / 6 + 96, 100, 20, this.field_49114, var1 -> this.field_49113.accept(true))
      );
      this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 50, this.field_940 / 6 + 96, 100, 20, this.field_911, var1 -> {
         this.method_1132();
         this.field_49113.accept(false);
      }));
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 50 + 105, this.field_940 / 6 + 96, 100, 20, this.field_49115, var1 -> this.field_49113.accept(false))
      );
   }

   public void method_1132() {
      this.field_943.field_9600.method_38891(this.field_913);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      super.method_6767(var1, var2, var3, var4);
      if (this.field_910) {
         method_9788(var1, this.field_948, this.field_912, this.field_941 / 2, 110, 16764108);
      }
   }
}
