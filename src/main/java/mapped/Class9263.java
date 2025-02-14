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
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.scoreboard.ServerScoreboard;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9263 implements ArgumentType<String> {
   private static final Collection<String> field42598 = Arrays.<String>asList("foo", "*", "012");
   private static final DynamicCommandExceptionType field42599 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("arguments.objective.notFound", var0)
   );
   private static final DynamicCommandExceptionType field42600 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("arguments.objective.readonly", var0)
   );
   public static final DynamicCommandExceptionType field42601 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.scoreboard.objectives.add.longName", var0)
   );

   public static Class9263 method34860() {
      return new Class9263();
   }

   public static ScoreObjective method34861(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      String var4 = (String)var0.getArgument(var1, String.class);
      ServerScoreboard var5 = ((CommandSource)var0.getSource()).getServer().method1409();
      ScoreObjective var6 = var5.method20976(var4);
      if (var6 != null) {
         return var6;
      } else {
         throw field42599.create(var4);
      }
   }

   public static ScoreObjective method34862(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      ScoreObjective var4 = method34861(var0, var1);
      if (!var4.getCriteria().isReadOnly()) {
         return var4;
      } else {
         throw field42600.create(var4.method29336());
      }
   }

   public String parse(StringReader var1) throws CommandSyntaxException {
      String var4 = var1.readUnquotedString();
      if (var4.length() <= 16) {
         return var4;
      } else {
         throw field42601.create(16);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (!(var1.getSource() instanceof CommandSource)) {
         if (!(var1.getSource() instanceof ISuggestionProvider)) {
            return Suggestions.empty();
         } else {
            ISuggestionProvider var5 = (ISuggestionProvider)var1.getSource();
            return var5.getSuggestionsFromServer((CommandContext<ISuggestionProvider>) var1, var2);
         }
      } else {
         return ISuggestionProvider.suggest(((CommandSource)var1.getSource()).getServer().method1409().method20983(), var2);
      }
   }

   public Collection<String> getExamples() {
      return field42598;
   }
}
