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

public class class_6868 implements ArgumentType<String> {
   private static final Collection<String> field_35379 = Arrays.<String>asList("foo", "123");
   private static final DynamicCommandExceptionType field_35378 = new DynamicCommandExceptionType(var0 -> new TranslationTextComponent("team.notFound", var0));

   public static class_6868 method_31509() {
      return new class_6868();
   }

   public static class_3903 method_31511(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      String var4 = (String)var0.getArgument(var1, String.class);
      class_2917 var5 = ((class_9155)var0.getSource()).method_42177().method_1655();
      class_3903 var6 = var5.method_4850(var4);
      if (var6 != null) {
         return var6;
      } else {
         throw field_35378.create(var4);
      }
   }

   public String parse(StringReader var1) throws CommandSyntaxException {
      return var1.readUnquotedString();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return !(var1.getSource() instanceof class_8773) ? Suggestions.empty() : class_8773.method_40319(((class_8773)var1.getSource()).method_40330(), var2);
   }

   public Collection<String> getExamples() {
      return field_35379;
   }
}
