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

public class class_8755 implements ArgumentType<class_4382> {
   private static final Collection<String> field_44814 = Arrays.<String>asList("unbreaking", "silk_touch");
   public static final DynamicCommandExceptionType field_44812 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("enchantment.unknown", var0)
   );

   public static class_8755 method_40199() {
      return new class_8755();
   }

   public static class_4382 method_40198(CommandContext<class_9155> var0, String var1) {
      return (class_4382)var0.getArgument(var1, class_4382.class);
   }

   public class_4382 parse(StringReader var1) throws CommandSyntaxException {
      class_4639 var4 = class_4639.method_21464(var1);
      return class_8669.field_44445.method_39794(var4).orElseThrow(() -> field_44812.create(var4));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class_8773.method_40324(class_8669.field_44445.method_39805(), var2);
   }

   public Collection<String> getExamples() {
      return field_44814;
   }
}
