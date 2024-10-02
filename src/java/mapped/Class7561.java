package mapped;

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

import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7561 implements ArgumentType<TextFormatting> {
   private static final Collection<String> field32486 = Arrays.<String>asList("red", "green");
   public static final DynamicCommandExceptionType field32487 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.color.invalid", var0)
   );

   private Class7561() {
   }

   public static Class7561 method24747() {
      return new Class7561();
   }

   public static TextFormatting method24748(CommandContext<CommandSource> var0, String var1) {
      return (TextFormatting)var0.getArgument(var1, TextFormatting.class);
   }

   public TextFormatting parse(StringReader var1) throws CommandSyntaxException {
      String var4 = var1.readUnquotedString();
      TextFormatting var5 = TextFormatting.getValueByName(var4);
      if (var5 != null && !var5.isFancyStyling()) {
         return var5;
      } else {
         throw field32487.create(var4);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Class6618.method20147(TextFormatting.getValidValues(true, false), var2);
   }

   public Collection<String> getExamples() {
      return field32486;
   }
}
