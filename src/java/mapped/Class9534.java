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
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9534 implements ArgumentType<Enchantment> {
   private static final Collection<String> field44364 = Arrays.<String>asList("unbreaking", "silk_touch");
   public static final DynamicCommandExceptionType field44365 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("enchantment.unknown", var0)
   );

   public static Class9534 method36862() {
      return new Class9534();
   }

   public static Enchantment method36863(CommandContext<CommandSource> var0, String var1) {
      return (Enchantment)var0.getArgument(var1, Enchantment.class);
   }

   public Enchantment parse(StringReader var1) throws CommandSyntaxException {
      ResourceLocation var4 = ResourceLocation.method8294(var1);
      return Registry.ENCHANTMENT.method9187(var4).orElseThrow(() -> field44365.create(var4));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return ISuggestionProvider.suggestIterable(Registry.ENCHANTMENT.keySet(), var2);
   }

   public Collection<String> getExamples() {
      return field44364;
   }
}
