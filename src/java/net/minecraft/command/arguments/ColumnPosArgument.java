package net.minecraft.command.arguments;

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

import mapped.Class7331;
import mapped.Class7760;
import mapped.Class8796;
import mapped.Commands;
import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;

public class ColumnPosArgument implements ArgumentType<ILocationArgument> {
   private static final Collection<String> field39235 = Arrays.<String>asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType field39236 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos2d.incomplete"));

   public static ColumnPosArgument method31319() {
      return new ColumnPosArgument();
   }

   public static Class7760 method31320(CommandContext<CommandSource> var0, String var1) {
      BlockPos var4 = ((ILocationArgument)var0.getArgument(var1, ILocationArgument.class)).getBlockPos((CommandSource)var0.getSource());
      return new Class7760(var4.getX(), var4.getZ());
   }

   public ILocationArgument parse(StringReader var1) throws CommandSyntaxException {
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
      if (!(var1.getSource() instanceof ISuggestionProvider)) {
         return Suggestions.empty();
      } else {
         String var5 = var2.getRemaining();
         Object var6;
         if (!var5.isEmpty() && var5.charAt(0) == '^') {
            var6 = Collections.<ISuggestionProvider.Coordinates>singleton(ISuggestionProvider.Coordinates.DEFAULT_LOCAL);
         } else {
            var6 = ((ISuggestionProvider)var1.getSource()).defaultLocal();
         }

         return ISuggestionProvider.func_211269_a(var5, (Collection<ISuggestionProvider.Coordinates>)var6, var2, Commands.method18841(this::parse));
      }
   }

   public Collection<String> getExamples() {
      return field39235;
   }
}
