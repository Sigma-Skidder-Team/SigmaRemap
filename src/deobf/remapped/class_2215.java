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
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2215 implements ArgumentType<TextFormatting> {
   private static final Collection<String> field_11090 = Arrays.<String>asList("red", "green");
   public static final DynamicCommandExceptionType field_11089 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.color.invalid", var0)
   );

   private class_2215() {
   }

   public static class_2215 method_10243() {
      return new class_2215();
   }

   public static TextFormatting method_10242(CommandContext<class_9155> var0, String var1) {
      return (TextFormatting)var0.getArgument(var1, TextFormatting.class);
   }

   public TextFormatting parse(StringReader var1) throws CommandSyntaxException {
      String var4 = var1.readUnquotedString();
      TextFormatting var5 = TextFormatting.getValueByName(var4);
      if (var5 != null && !var5.isFancyStyling()) {
         return var5;
      } else {
         throw field_11089.create(var4);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class_8773.method_40319(TextFormatting.getValidValues(true, false), var2);
   }

   public Collection<String> getExamples() {
      return field_11090;
   }
}
