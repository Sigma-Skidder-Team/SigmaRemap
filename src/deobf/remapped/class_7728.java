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

public class class_7728 implements ArgumentType<String> {
   private static final Collection<String> field_39196 = Arrays.<String>asList("foo", "*", "012");
   private static final DynamicCommandExceptionType field_39193 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("arguments.objective.notFound", var0)
   );
   private static final DynamicCommandExceptionType field_39195 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("arguments.objective.readonly", var0)
   );
   public static final DynamicCommandExceptionType field_39194 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.scoreboard.objectives.add.longName", var0)
   );

   public static class_7728 method_34976() {
      return new class_7728();
   }

   public static class_4399 method_34978(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      String var4 = (String)var0.getArgument(var1, String.class);
      class_2917 var5 = ((class_9155)var0.getSource()).method_42177().method_1655();
      class_4399 var6 = var5.method_4858(var4);
      if (var6 != null) {
         return var6;
      } else {
         throw field_39193.create(var4);
      }
   }

   public static class_4399 method_34977(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      class_4399 var4 = method_34978(var0, var1);
      if (!var4.method_20491().method_31258()) {
         return var4;
      } else {
         throw field_39195.create(var4.method_20490());
      }
   }

   public String parse(StringReader var1) throws CommandSyntaxException {
      String var4 = var1.readUnquotedString();
      if (var4.length() <= 16) {
         return var4;
      } else {
         throw field_39194.create(16);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (!(var1.getSource() instanceof class_9155)) {
         if (!(var1.getSource() instanceof class_8773)) {
            return Suggestions.empty();
         } else {
            class_8773 var5 = (class_8773)var1.getSource();
            return var5.method_40316(var1, var2);
         }
      } else {
         return class_8773.method_40319(((class_9155)var1.getSource()).method_42177().method_1655().method_4832(), var2);
      }
   }

   public Collection<String> getExamples() {
      return field_39196;
   }
}
