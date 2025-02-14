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
import mapped.Class8796;
import mapped.Commands;
import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.TranslationTextComponent;

public class Vec2Argument implements ArgumentType<ILocationArgument> {
   private static final Collection<String> EXAMPLES = Arrays.<String>asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
   public static final SimpleCommandExceptionType VEC2_INCOMPLETE = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos2d.incomplete"));
   private final boolean centerIntegers;

   public Vec2Argument(boolean var1) {
      this.centerIntegers = var1;
   }

   public static Vec2Argument method23292() {
      return new Vec2Argument(true);
   }

   public static Vector2f method23293(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      Vector3d var4 = ((ILocationArgument)var0.getArgument(var1, ILocationArgument.class)).getPosition((CommandSource)var0.getSource());
      return new Vector2f((float)var4.x, (float)var4.z);
   }

   public ILocationArgument parse(StringReader var1) throws CommandSyntaxException {
      int var4 = var1.getCursor();
      if (var1.canRead()) {
         Class8796 var5 = Class8796.method31755(var1, this.centerIntegers);
         if (var1.canRead() && var1.peek() == ' ') {
            var1.skip();
            Class8796 var6 = Class8796.method31755(var1, this.centerIntegers);
            return new Class7331(var5, new Class8796(true, 0.0), var6);
         } else {
            var1.setCursor(var4);
            throw VEC2_INCOMPLETE.createWithContext(var1);
         }
      } else {
         throw VEC2_INCOMPLETE.createWithContext(var1);
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
            var6 = ((ISuggestionProvider)var1.getSource()).defaultGlobal();
         }

         return ISuggestionProvider.func_211269_a(var5, (Collection<ISuggestionProvider.Coordinates>)var6, var2, Commands.method18841(this::parse));
      }
   }

   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
