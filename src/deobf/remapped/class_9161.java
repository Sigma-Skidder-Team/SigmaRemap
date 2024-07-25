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

public class class_9161 implements ArgumentType<Integer> {
   private static final Collection<String> field_46874 = Arrays.<String>asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType field_46872 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.scoreboardDisplaySlot.invalid", var0)
   );

   private class_9161() {
   }

   public static class_9161 method_42209() {
      return new class_9161();
   }

   public static int method_42207(CommandContext<class_9155> var0, String var1) {
      return (Integer)var0.getArgument(var1, Integer.class);
   }

   public Integer parse(StringReader var1) throws CommandSyntaxException {
      String var4 = var1.readUnquotedString();
      int var5 = class_1097.method_4843(var4);
      if (var5 != -1) {
         return var5;
      } else {
         throw field_46872.create(var4);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class_8773.method_40321(class_1097.method_4867(), var2);
   }

   public Collection<String> getExamples() {
      return field_46874;
   }
}
