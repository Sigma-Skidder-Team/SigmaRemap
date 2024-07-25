package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4385 implements ArgumentType<class_6810> {
   private static final Collection<String> field_21503 = Arrays.<String>asList("foo", "foo.bar.baz", "minecraft:foo");
   public static final DynamicCommandExceptionType field_21504 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.criteria.invalid", var0)
   );

   private class_4385() {
   }

   public static class_4385 method_20444() {
      return new class_4385();
   }

   public static class_6810 method_20445(CommandContext<class_9155> var0, String var1) {
      return (class_6810)var0.getArgument(var1, class_6810.class);
   }

   public class_6810 parse(StringReader var1) throws CommandSyntaxException {
      int var4 = var1.getCursor();

      while (var1.canRead() && var1.peek() != ' ') {
         var1.skip();
      }

      String var5 = var1.getString().substring(var4, var1.getCursor());
      return class_6810.method_31260(var5).orElseThrow(() -> {
         var1.setCursor(var4);
         return field_21504.create(var5);
      });
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      ArrayList var5 = Lists.newArrayList(class_6810.field_35136.keySet());

      for (class_9478 var7 : class_8669.field_44376) {
         for (Object var9 : var7.method_43788()) {
            String var10 = this.method_20446(var7, var9);
            var5.add(var10);
         }
      }

      return class_8773.method_40319(var5, var2);
   }

   public <T> String method_20446(class_9478<T> var1, Object var2) {
      return class_6676.method_30628(var1, var2);
   }

   public Collection<String> getExamples() {
      return field_21503;
   }
}
