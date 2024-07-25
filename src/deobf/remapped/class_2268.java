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
import java.util.function.Predicate;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2268 implements ArgumentType<class_6782> {
   private static final Collection<String> field_11282 = Arrays.<String>asList("stick", "minecraft:stick", "#stick", "#stick{foo=bar}");
   private static final DynamicCommandExceptionType field_11280 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("arguments.item.tag.unknown", var0)
   );

   public static class_2268 method_10470() {
      return new class_2268();
   }

   public class_6782 parse(StringReader var1) throws CommandSyntaxException {
      class_9599 var4 = new class_9599(var1, true).method_44335();
      if (var4.method_44342() == null) {
         class_4639 var6 = var4.method_44334();
         return var2 -> {
            class_2307 var5x = ((class_9155)var2.getSource()).method_42177().method_1754().method_29393().method_43140(var6);
            if (var5x != null) {
               return new class_4177(var5x, var4.method_44338());
            } else {
               throw field_11280.create(var6.toString());
            }
         };
      } else {
         class_2293 var5 = new class_2293(var4.method_44342(), var4.method_44338());
         return var1x -> var5;
      }
   }

   public static Predicate<class_6098> method_10469(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return ((class_6782)var0.getArgument(var1, class_6782.class)).method_31094(var0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var5 = new StringReader(var2.getInput());
      var5.setCursor(var2.getStart());
      class_9599 var6 = new class_9599(var5, true);

      try {
         var6.method_44335();
      } catch (CommandSyntaxException var8) {
      }

      return var6.method_44336(var2, class_391.method_1891());
   }

   public Collection<String> getExamples() {
      return field_11282;
   }
}
