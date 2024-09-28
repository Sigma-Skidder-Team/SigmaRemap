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

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.server.ServerWorld;

public class Class6849 implements ArgumentType<Class7329> {
   private static final Collection<String> field29740 = Arrays.<String>asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType field29741 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType field29742 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos.outofworld"));

   public static Class6849 method20826() {
      return new Class6849();
   }

   public static BlockPos method20827(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      BlockPos var4 = ((Class7329)var0.getArgument(var1, Class7329.class)).method23230((Class6619)var0.getSource());
      if (((Class6619)var0.getSource()).method20172().isBlockLoaded(var4)) {
         ((Class6619)var0.getSource()).method20172();
         if (ServerWorld.isValid(var4)) {
            return var4;
         } else {
            throw field29742.create();
         }
      } else {
         throw field29741.create();
      }
   }

   public static BlockPos method20828(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      return ((Class7329)var0.getArgument(var1, Class7329.class)).method23230((Class6619)var0.getSource());
   }

   public Class7329 parse(StringReader var1) throws CommandSyntaxException {
      return (Class7329)(var1.canRead() && var1.peek() == '^' ? Class7330.method23234(var1) : Class7331.method23236(var1));
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

         return Class6618.method20145(var5, (Collection<Class9203>)var6, var2, Class6099.method18841(this::parse));
      }
   }

   public Collection<String> getExamples() {
      return field29740;
   }
}
