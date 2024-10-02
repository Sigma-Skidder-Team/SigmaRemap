package mapped;

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

import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9188 implements ArgumentType<Class2062> {
   private static final Collection<String> field42196 = Arrays.<String>asList("eyes", "feet");
   private static final DynamicCommandExceptionType field42197 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.anchor.invalid", var0)
   );

   public static Class2062 method34387(CommandContext<CommandSource> var0, String var1) {
      return (Class2062)var0.getArgument(var1, Class2062.class);
   }

   public static Class9188 method34388() {
      return new Class9188();
   }

   public Class2062 parse(StringReader var1) throws CommandSyntaxException {
      int var4 = var1.getCursor();
      String var5 = var1.readUnquotedString();
      Class2062 var6 = Class2062.method8710(var5);
      if (var6 != null) {
         return var6;
      } else {
         var1.setCursor(var4);
         throw field42197.createWithContext(var1, var5);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Class6618.method20147(Class2062.method8716().keySet(), var2);
   }

   public Collection<String> getExamples() {
      return field42196;
   }
}
