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

import mapped.Class7330;
import mapped.Class7331;
import mapped.Commands;
import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.TranslationTextComponent;

public class Vec3Argument implements ArgumentType<ILocationArgument> {
   private static final Collection<String> field29765 = Arrays.<String>asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType field29766 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType field29767 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos.mixed"));
   private final boolean field29768;

   public Vec3Argument(boolean var1) {
      this.field29768 = var1;
   }

   public static Vec3Argument method20857() {
      return new Vec3Argument(true);
   }

   public static Vec3Argument method20858(boolean var0) {
      return new Vec3Argument(var0);
   }

   public static Vector3d method20859(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      return ((ILocationArgument)var0.getArgument(var1, ILocationArgument.class)).getPosition((CommandSource)var0.getSource());
   }

   public static ILocationArgument method20860(CommandContext<CommandSource> var0, String var1) {
      return (ILocationArgument)var0.getArgument(var1, ILocationArgument.class);
   }

   public ILocationArgument parse(StringReader var1) throws CommandSyntaxException {
      return (ILocationArgument)(var1.canRead() && var1.peek() == '^' ? Class7330.method23234(var1) : Class7331.method23237(var1, this.field29768));
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

         return ISuggestionProvider.method20145(var5, (Collection<ISuggestionProvider.Coordinates>)var6, var2, Commands.method18841(this::parse));
      }
   }

   public Collection<String> getExamples() {
      return field29765;
   }
}
