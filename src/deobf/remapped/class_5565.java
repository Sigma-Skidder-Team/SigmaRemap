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

public class class_5565 implements ArgumentType<class_1808> {
   private static final Collection<String> field_28289 = Arrays.<String>asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType field_28288 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos2d.incomplete"));

   public static class_5565 method_25275() {
      return new class_5565();
   }

   public static class_2651 method_25276(CommandContext<class_9155> var0, String var1) {
      class_1331 var4 = ((class_1808)var0.getArgument(var1, class_1808.class)).method_8024((class_9155)var0.getSource());
      return new class_2651(var4.method_12173(), var4.method_12185());
   }

   public class_1808 parse(StringReader var1) throws CommandSyntaxException {
      int var4 = var1.getCursor();
      if (var1.canRead()) {
         class_5941 var5 = class_5941.method_27172(var1);
         if (var1.canRead() && var1.peek() == ' ') {
            var1.skip();
            class_5941 var6 = class_5941.method_27172(var1);
            return new class_5095(var5, new class_5941(true, 0.0), var6);
         } else {
            var1.setCursor(var4);
            throw field_28288.createWithContext(var1);
         }
      } else {
         throw field_28288.createWithContext(var1);
      }
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

         return class_8773.method_40311(var5, (Collection<class_7461>)var6, var2, class_465.method_2235(this::parse));
      }
   }

   public Collection<String> getExamples() {
      return field_28289;
   }
}
