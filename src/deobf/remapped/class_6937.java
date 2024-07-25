package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6937 implements ArgumentType<Identifier> {
   private static final Collection<String> field_35659 = Stream.<class_5621>of(class_6486.field_33048, class_6486.field_33029)
      .<String>map(var0 -> var0.method_25499().toString())
      .collect(Collectors.<String>toList());
   private static final DynamicCommandExceptionType field_35660 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.dimension.invalid", var0)
   );

   public Identifier parse(StringReader var1) throws CommandSyntaxException {
      return Identifier.method_21464(var1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return !(var1.getSource() instanceof class_8773)
         ? Suggestions.empty()
         : class_8773.method_40310(((class_8773)var1.getSource()).method_40317().stream().<Identifier>map(class_5621::method_25499), var2);
   }

   public Collection<String> getExamples() {
      return field_35659;
   }

   public static class_6937 method_31737() {
      return new class_6937();
   }

   public static class_6331 method_31736(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      Identifier var4 = (Identifier)var0.getArgument(var1, Identifier.class);
      class_5621 var5 = class_5621.<class_6486>method_25497(class_8669.field_44372, var4);
      class_6331 var6 = ((class_9155)var0.getSource()).method_42177().method_1697(var5);
      if (var6 != null) {
         return var6;
      } else {
         throw field_35660.create(var4);
      }
   }
}
