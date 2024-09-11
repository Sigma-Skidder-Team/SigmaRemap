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

import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9639 implements ArgumentType<Integer> {
   private static final Collection<String> field45069 = Arrays.<String>asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType field45070 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.scoreboardDisplaySlot.invalid", var0)
   );

   private Class9639() {
   }

   public static Class9639 method37566() {
      return new Class9639();
   }

   public static int method37567(CommandContext<Class6619> var0, String var1) {
      return (Integer)var0.getArgument(var1, Integer.class);
   }

   public Integer parse(StringReader var1) throws CommandSyntaxException {
      String var4 = var1.readUnquotedString();
      int var5 = Scoreboard.method21009(var4);
      if (var5 != -1) {
         return var5;
      } else {
         throw field45070.create(var4);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Class6618.method20149(Scoreboard.method21010(), var2);
   }

   public Collection<String> getExamples() {
      return field45069;
   }
}
