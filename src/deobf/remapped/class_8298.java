package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import net.minecraft.util.text.StringTextComponent;

public class class_8298 implements ArgumentType<class_226> {
   private static final Collection<String> field_42526 = Arrays.<String>asList("techtests.piston", "techtests");

   public class_226 parse(StringReader var1) throws CommandSyntaxException {
      String var4 = var1.readUnquotedString();
      Optional var5 = class_3084.method_14148(var4);
      if (!var5.isPresent()) {
         StringTextComponent var6 = new StringTextComponent("No such test: " + var4);
         throw new CommandSyntaxException(new SimpleCommandExceptionType(var6), var6);
      } else {
         return (class_226)var5.get();
      }
   }

   public static class_8298 method_38282() {
      return new class_8298();
   }

   public static class_226 method_38281(CommandContext<class_9155> var0, String var1) {
      return (class_226)var0.getArgument(var1, class_226.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      Stream var5 = class_3084.method_14152().stream().<String>map(class_226::method_962);
      return class_8773.method_40320(var5, var2);
   }

   public Collection<String> getExamples() {
      return field_42526;
   }
}
