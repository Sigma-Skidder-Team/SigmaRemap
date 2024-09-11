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

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9534 implements ArgumentType<Class6069> {
   private static final Collection<String> field44364 = Arrays.<String>asList("unbreaking", "silk_touch");
   public static final DynamicCommandExceptionType field44365 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("enchantment.unknown", var0)
   );

   public static Class9534 method36862() {
      return new Class9534();
   }

   public static Class6069 method36863(CommandContext<Class6619> var0, String var1) {
      return (Class6069)var0.getArgument(var1, Class6069.class);
   }

   public Class6069 parse(StringReader var1) throws CommandSyntaxException {
      ResourceLocation var4 = ResourceLocation.method8294(var1);
      return Registry.field16073.method9187(var4).orElseThrow(() -> field44365.create(var4));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Class6618.method20141(Registry.field16073.method9190(), var2);
   }

   public Collection<String> getExamples() {
      return field44364;
   }
}
