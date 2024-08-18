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

public class class_1843 implements ArgumentType<class_1808> {
   private static final Collection<String> field_9361 = Arrays.<String>asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
   public static final SimpleCommandExceptionType field_9360 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos2d.incomplete"));
   private final boolean field_9358;

   public class_1843(boolean var1) {
      this.field_9358 = var1;
   }

   public static class_1843 method_8148() {
      return new class_1843(true);
   }

   public static class_4895 method_8146(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      Vector3d var4 = ((class_1808)var0.getArgument(var1, class_1808.class)).method_8027((class_9155)var0.getSource());
      return new class_4895((float)var4.field_7336, (float)var4.field_7334);
   }

   public class_1808 parse(StringReader var1) throws CommandSyntaxException {
      int var4 = var1.getCursor();
      if (var1.canRead()) {
         class_5941 var5 = class_5941.method_27171(var1, this.field_9358);
         if (var1.canRead() && var1.peek() == ' ') {
            var1.skip();
            class_5941 var6 = class_5941.method_27171(var1, this.field_9358);
            return new class_5095(var5, new class_5941(true, 0.0), var6);
         } else {
            var1.setCursor(var4);
            throw field_9360.createWithContext(var1);
         }
      } else {
         throw field_9360.createWithContext(var1);
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
            var6 = ((class_8773)var1.getSource()).method_40323();
         }

         return class_8773.method_40311(var5, (Collection<class_7461>)var6, var2, class_465.method_2235(this::parse));
      }
   }

   public Collection<String> getExamples() {
      return field_9361;
   }
}
