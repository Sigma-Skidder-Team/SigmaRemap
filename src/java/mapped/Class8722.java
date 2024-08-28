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

public class Class8722 implements ArgumentType<Class176> {
   private static final Collection<String> field39351 = Arrays.<String>asList("stick", "minecraft:stick", "stick{foo=bar}");

   public static Class8722 method31481() {
      return new Class8722();
   }

   public Class176 parse(StringReader var1) throws CommandSyntaxException {
      Class9759 var4 = new Class9759(var1, false).method38359();
      return new Class176(var4.method38353(), var4.method38354());
   }

   public static <S> Class176 method31482(CommandContext<S> var0, String var1) {
      return (Class176)var0.getArgument(var1, Class176.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var5 = new StringReader(var2.getInput());
      var5.setCursor(var2.getStart());
      Class9759 var6 = new Class9759(var5, false);

      try {
         var6.method38359();
      } catch (CommandSyntaxException var8) {
      }

      return var6.method38363(var2, Class5985.method18561());
   }

   public Collection<String> getExamples() {
      return field39351;
   }
}
