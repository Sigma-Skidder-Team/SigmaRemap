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

import net.minecraft.command.CommandSource;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6851 implements ArgumentType<Class7329> {
   private static final Collection<String> field29765 = Arrays.<String>asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType field29766 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType field29767 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.pos.mixed"));
   private final boolean field29768;

   public Class6851(boolean var1) {
      this.field29768 = var1;
   }

   public static Class6851 method20857() {
      return new Class6851(true);
   }

   public static Class6851 method20858(boolean var0) {
      return new Class6851(var0);
   }

   public static Vector3d method20859(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      return ((Class7329)var0.getArgument(var1, Class7329.class)).method23228((CommandSource)var0.getSource());
   }

   public static Class7329 method20860(CommandContext<CommandSource> var0, String var1) {
      return (Class7329)var0.getArgument(var1, Class7329.class);
   }

   public Class7329 parse(StringReader var1) throws CommandSyntaxException {
      return (Class7329)(var1.canRead() && var1.peek() == '^' ? Class7330.method23234(var1) : Class7331.method23237(var1, this.field29768));
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
            var6 = ((Class6618)var1.getSource()).method20134();
         }

         return Class6618.method20145(var5, (Collection<Class9203>)var6, var2, Class6099.method18841(this::parse));
      }
   }

   public Collection<String> getExamples() {
      return field29765;
   }
}
