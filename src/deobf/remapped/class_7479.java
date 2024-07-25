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
import java.util.concurrent.CompletableFuture;
import net.minecraft.util.text.StringTextComponent;

public class class_7479 implements ArgumentType<String> {
   private static final Collection<String> field_38164 = Arrays.<String>asList("techtests", "mobtests");

   public String parse(StringReader var1) throws CommandSyntaxException {
      String var4 = var1.readUnquotedString();
      if (!class_3084.method_14146(var4)) {
         StringTextComponent var5 = new StringTextComponent("No such test class: " + var4);
         throw new CommandSyntaxException(new SimpleCommandExceptionType(var5), var5);
      } else {
         return var4;
      }
   }

   public static class_7479 method_34001() {
      return new class_7479();
   }

   public static String method_34002(CommandContext<class_9155> var0, String var1) {
      return (String)var0.getArgument(var1, String.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class_8773.method_40320(class_3084.method_14151().stream(), var2);
   }

   public Collection<String> getExamples() {
      return field_38164;
   }
}
