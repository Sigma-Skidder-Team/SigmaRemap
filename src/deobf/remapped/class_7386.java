package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7386 implements ArgumentType<class_6139> {
   private static final Collection<String> field_37719 = Arrays.<String>asList("eyes", "feet");
   private static final DynamicCommandExceptionType field_37717 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.anchor.invalid", var0)
   );

   public static class_6139 method_33645(CommandContext<class_9155> var0, String var1) {
      return (class_6139)var0.getArgument(var1, class_6139.class);
   }

   public static class_7386 method_33644() {
      return new class_7386();
   }

   public class_6139 parse(StringReader var1) throws CommandSyntaxException {
      int var4 = var1.getCursor();
      String var5 = var1.readUnquotedString();
      class_6139 var6 = class_6139.method_28186(var5);
      if (var6 != null) {
         return var6;
      } else {
         var1.setCursor(var4);
         throw field_37717.createWithContext(var1, var5);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class_8773.method_40319(class_6139.method_28190().keySet(), var2);
   }

   public Collection<String> getExamples() {
      return field_37719;
   }
}
