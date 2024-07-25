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

public class class_8493 implements ArgumentType<class_1425> {
   private static final Collection<String> field_43510 = Arrays.<String>asList("spooky", "effect");
   public static final DynamicCommandExceptionType field_43509 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("effect.effectNotFound", var0)
   );

   public static class_8493 method_39144() {
      return new class_8493();
   }

   public static class_1425 method_39145(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return (class_1425)var0.getArgument(var1, class_1425.class);
   }

   public class_1425 parse(StringReader var1) throws CommandSyntaxException {
      class_4639 var4 = class_4639.method_21464(var1);
      return class_8669.field_44436.method_39794(var4).orElseThrow(() -> field_43509.create(var4));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class_8773.method_40324(class_8669.field_44436.method_39805(), var2);
   }

   public Collection<String> getExamples() {
      return field_43510;
   }
}
