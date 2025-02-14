package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.util.text.StringTextComponent;

public class Class9210 implements ArgumentType<String> {
   private static final Collection<String> field42397 = Arrays.<String>asList("techtests", "mobtests");

   public String parse(StringReader var1) throws CommandSyntaxException {
      String var4 = var1.readUnquotedString();
      if (!Class7936.method26706(var4)) {
         StringTextComponent var5 = new StringTextComponent("No such test class: " + var4);
         throw new CommandSyntaxException(new SimpleCommandExceptionType(var5), var5);
      } else {
         return var4;
      }
   }

   public static Class9210 method34510() {
      return new Class9210();
   }

   public static String method34511(CommandContext<CommandSource> var0, String var1) {
      return (String)var0.getArgument(var1, String.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return ISuggestionProvider.suggest(Class7936.method26705().stream(), var2);
   }

   public Collection<String> getExamples() {
      return field42397;
   }
}
