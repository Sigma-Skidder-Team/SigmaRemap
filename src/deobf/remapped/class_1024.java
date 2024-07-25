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
import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1024 implements ArgumentType<class_1808> {
   private static final Collection<String> field_5673 = Arrays.<String>asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType field_5670 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType field_5672 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos.outofworld"));

   public static class_1024 method_4522() {
      return new class_1024();
   }

   public static class_1331 method_4519(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      class_1331 var4 = ((class_1808)var0.getArgument(var1, class_1808.class)).method_8024((class_9155)var0.getSource());
      if (((class_9155)var0.getSource()).method_42198().method_22559(var4)) {
         ((class_9155)var0.getSource()).method_42198();
         if (class_6331.method_29586(var4)) {
            return var4;
         } else {
            throw field_5672.create();
         }
      } else {
         throw field_5670.create();
      }
   }

   public static class_1331 method_4520(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return ((class_1808)var0.getArgument(var1, class_1808.class)).method_8024((class_9155)var0.getSource());
   }

   public class_1808 parse(StringReader var1) throws CommandSyntaxException {
      return (class_1808)(var1.canRead() && var1.peek() == '^' ? class_3188.method_14679(var1) : class_5095.method_23411(var1));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (!(var1.getSource() instanceof class_8773)) {
         return Suggestions.empty();
      } else {
         String var5 = var2.getRemaining();
         Object var6;
         if (!var5.isEmpty() && var5.charAt(0) == '^') {
            var6 = Collections.<class_7461>singleton(class_7461.field_38014);
         } else {
            var6 = ((class_8773)var1.getSource()).method_40322();
         }

         return class_8773.method_40328(var5, (Collection<class_7461>)var6, var2, class_465.method_2235(this::parse));
      }
   }

   public Collection<String> getExamples() {
      return field_5673;
   }
}
