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

public class class_3469 implements ArgumentType<class_5079> {
   private static final Collection<String> field_16994 = Arrays.<String>asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType field_16995 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("particle.notFound", var0)
   );

   public static class_3469 method_15951() {
      return new class_3469();
   }

   public static class_5079 method_15953(CommandContext<class_9155> var0, String var1) {
      return (class_5079)var0.getArgument(var1, class_5079.class);
   }

   public class_5079 parse(StringReader var1) throws CommandSyntaxException {
      return method_15950(var1);
   }

   public Collection<String> getExamples() {
      return field_16994;
   }

   public static class_5079 method_15950(StringReader var0) throws CommandSyntaxException {
      Identifier var3 = Identifier.method_21464(var0);
      class_8583 var4 = class_8669.field_44387.method_39794(var3).orElseThrow(() -> field_16995.create(var3));
      return method_15952(var0, var4);
   }

   private static <T extends class_5079> T method_15952(StringReader var0, class_8583<T> var1) throws CommandSyntaxException {
      return (T)var1.method_39482().method_36183(var1, var0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class_8773.method_40324(class_8669.field_44387.method_39805(), var2);
   }
}
