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
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9468 implements ArgumentType<Effect> {
   private static final Collection<String> field44000 = Arrays.<String>asList("spooky", "effect");
   public static final DynamicCommandExceptionType field44001 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("effect.effectNotFound", var0)
   );

   public static Class9468 method36510() {
      return new Class9468();
   }

   public static Effect method36511(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      return (Effect)var0.getArgument(var1, Effect.class);
   }

   public Effect parse(StringReader var1) throws CommandSyntaxException {
      ResourceLocation var4 = ResourceLocation.method8294(var1);
      return Registry.EFFECTS.method9187(var4).orElseThrow(() -> field44001.create(var4));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Class6618.method20141(Registry.EFFECTS.method9190(), var2);
   }

   public Collection<String> getExamples() {
      return field44000;
   }
}
