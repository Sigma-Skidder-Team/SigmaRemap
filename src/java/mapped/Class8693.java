package mapped;

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

public class Class8693 implements ArgumentType<Class7329> {
   private static final Collection<String> field39235 = Arrays.<String>asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType field39236 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos2d.incomplete"));

   public static Class8693 method31319() {
      return new Class8693();
   }

   public static Class7760 method31320(CommandContext<Class6619> var0, String var1) {
      BlockPos var4 = ((Class7329)var0.getArgument(var1, Class7329.class)).method23230((Class6619)var0.getSource());
      return new Class7760(var4.method8304(), var4.method8306());
   }

   public Class7329 parse(StringReader var1) throws CommandSyntaxException {
      int var4 = var1.getCursor();
      if (var1.canRead()) {
         Class8796 var5 = Class8796.method31756(var1);
         if (var1.canRead() && var1.peek() == ' ') {
            var1.skip();
            Class8796 var6 = Class8796.method31756(var1);
            return new Class7331(var5, new Class8796(true, 0.0), var6);
         } else {
            var1.setCursor(var4);
            throw field39236.createWithContext(var1);
         }
      } else {
         throw field39236.createWithContext(var1);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (!(var1.getSource() instanceof Class6618)) {
         return Suggestions.empty();
      } else {
         String var5 = var2.getRemaining();
         Object var6;
         if (!var5.isEmpty() && var5.charAt(0) == '^') {
            var6 = Collections.<Class9203>singleton(Class9203.field42265);
         } else {
            var6 = ((Class6618)var1.getSource()).method20133();
         }

         return Class6618.method20146(var5, (Collection<Class9203>)var6, var2, Class6099.method18841(this::parse));
      }
   }

   public Collection<String> getExamples() {
      return field39235;
   }
}
