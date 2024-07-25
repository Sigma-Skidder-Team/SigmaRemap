package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class class_5663 implements ArgumentType<class_3238> {
   private static final Collection<String> field_28707 = Arrays.<String>asList("stick", "minecraft:stick", "stick{foo=bar}");

   public static class_5663 method_25627() {
      return new class_5663();
   }

   public class_3238 parse(StringReader var1) throws CommandSyntaxException {
      class_9599 var4 = new class_9599(var1, false).method_44335();
      return new class_3238(var4.method_44342(), var4.method_44338());
   }

   public static <S> class_3238 method_25625(CommandContext<S> var0, String var1) {
      return (class_3238)var0.getArgument(var1, class_3238.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var5 = new StringReader(var2.getInput());
      var5.setCursor(var2.getStart());
      class_9599 var6 = new class_9599(var5, false);

      try {
         var6.method_44335();
      } catch (CommandSyntaxException var8) {
      }

      return var6.method_44336(var2, class_391.method_1891());
   }

   public Collection<String> getExamples() {
      return field_28707;
   }
}
