package remapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3460 implements class_1429 {
   private static final SuggestionProvider<class_9155> field_16953 = (var0, var1) -> class_8773.method_40310(method_15922(var0).method_29741(), var1);
   public static final Function<String, class_5098> field_16954 = var0 -> new class_9788(var0);
   private final class_6532 field_16957;
   private final class_4639 field_16956;

   private static class_6532 method_15922(CommandContext<class_9155> var0) {
      return ((class_9155)var0.getSource()).method_42177().method_1678();
   }

   private class_3460(class_6532 var1, class_4639 var2) {
      this.field_16957 = var1;
      this.field_16956 = var2;
   }

   @Override
   public void method_6572(class_5734 var1) {
      this.field_16957.method_29743(this.field_16956, var1);
   }

   @Override
   public class_5734 method_6573() {
      return this.field_16957.method_29742(this.field_16956);
   }

   @Override
   public ITextComponent method_6570() {
      return new TranslationTextComponent("commands.data.storage.modified", this.field_16956);
   }

   @Override
   public ITextComponent method_6574(class_8406 var1) {
      return new TranslationTextComponent("commands.data.storage.query", this.field_16956, var1.method_38711());
   }

   @Override
   public ITextComponent method_6571(class_9257 var1, double var2, int var4) {
      return new TranslationTextComponent("commands.data.storage.get", var1, this.field_16956, String.format(Locale.ROOT, "%.2f", var2), var4);
   }
}
