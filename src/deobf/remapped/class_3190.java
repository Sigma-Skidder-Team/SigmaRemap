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

public class class_3190 implements ArgumentType<class_6986> {
   private static final Collection<String> field_15930 = Arrays.<String>asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");

   public static class_3190 method_14683() {
      return new class_3190();
   }

   public class_6986 parse(StringReader var1) throws CommandSyntaxException {
      class_4104 var4 = new class_4104(var1, false).method_18973(true);
      return new class_6986(var4.method_18967(), var4.method_18985().keySet(), var4.method_18958());
   }

   public static class_6986 method_14681(CommandContext<class_9155> var0, String var1) {
      return (class_6986)var0.getArgument(var1, class_6986.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var5 = new StringReader(var2.getInput());
      var5.setCursor(var2.getStart());
      class_4104 var6 = new class_4104(var5, false);

      try {
         var6.method_18973(true);
      } catch (CommandSyntaxException var8) {
      }

      return var6.method_18969(var2, class_2351.method_10755());
   }

   public Collection<String> getExamples() {
      return field_15930;
   }
}
