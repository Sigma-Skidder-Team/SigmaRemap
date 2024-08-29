package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class Class7971 implements ArgumentType<Class164> {
   private static final Collection<String> field34264 = Arrays.<String>asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");

   public static Class7971 method27103() {
      return new Class7971();
   }

   public Class164 parse(StringReader var1) throws CommandSyntaxException {
      Class8268 var4 = new Class8268(var1, false).method28840(true);
      return new Class164(var4.method28837(), var4.method28836().keySet(), var4.method28838());
   }

   public static Class164 method27104(CommandContext<Class6619> var0, String var1) {
      return (Class164)var0.getArgument(var1, Class164.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var5 = new StringReader(var2.getInput());
      var5.setCursor(var2.getStart());
      Class8268 var6 = new Class8268(var5, false);

      try {
         var6.method28840(true);
      } catch (CommandSyntaxException var8) {
      }

      return var6.method28862(var2, BlockTags.getCollection());
   }

   public Collection<String> getExamples() {
      return field34264;
   }
}
